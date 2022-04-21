import java.util.Date;

public abstract class Call {
    protected int number;
    protected Date callDate;
    protected double duree;
    protected Contact contact;

    public abstract double cout();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getCallDate() {
        return callDate;
    }

    public void setCallDate(Date callDate) {
        this.callDate = callDate;
    }

    public double getDuree() {
        return duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Call(int number, Date callDate, double duree) {
        this.number = number;
        this.callDate = callDate;
        this.duree = duree;
    }

    public Call() {
    }
}
