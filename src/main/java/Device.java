import java.util.*;

public class Device implements DeviceImp {
    private final List<Contact> contacts = new ArrayList<>();
    private final Map<Integer, Call> calls = new HashMap<>();

    @Override
    public void save(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void save(Call call, String phoneNumber) {
        Contact contactFound = null;
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                contactFound = c;
                break;
            }
            call.setContact(contactFound);
            calls.put(call.getNumber(), call);
        }
    }

    @Override
    public Contact consulter(int number) throws Exception {
        for (Contact contact : contacts)
            if (contact.getNumber() == number)
                return contact;
        throw new Exception("number : " + number + " not found");
    }

    @Override
    public List<Contact> consulter(String mc) {
        List<Contact> contactList = new ArrayList<>();
        for (Contact contact : contacts)
            if (contact.getName().contains(mc))
                contactList.add(contact);
        return contactList;
    }

    @Override
    public double fullPrice() {
        double total = 00.00;
        for (Call call : calls.values())
            total += call.cout();
        return total;
    }

    @Override
    public double priceInADate(Date dateOne, Date dateTwo) {
        double total = 00.00;
        for (Call call : calls.values())
            if ((call.callDate.getTime() >= dateOne.getTime() && call.callDate.getTime() <= dateTwo.getTime()))
                total += call.cout();
        return total;
    }

    @Override
    public double callPrice(int contactNumber) {
        double total = 00.00;
        for (Call call : calls.values())
            if (call.getContact().getNumber() == contactNumber)
                total = call.cout();
        return total;
    }
}
