public class Contact {
    private int number;
    private String name;
    private String phoneNumber;
    private Call call;

    public Contact(int number, String name, String phoneNumber) {
        this.number = number;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
