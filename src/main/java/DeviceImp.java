import java.util.Date;
import java.util.List;

public interface DeviceImp {
    public void save(Contact contact);

    public void save(Call call, String phoneNumber);

    public Contact consulter(int number) throws Exception;

    public List<Contact> consulter(String mc);

    public double fullPrice();

    public double priceInADate(Date dateOne, Date dateTwo);

    public double callPrice(int contactNumber);
}
