import java.util.Date;

public class CallRecu extends Call {
    @Override
    public double cout() {
        return 0;
    }

    public CallRecu(int number, Date callDate, double duree) {
        super(number, callDate, duree);
    }

    public CallRecu() {
    }
}
