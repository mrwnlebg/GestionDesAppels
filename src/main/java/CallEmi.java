import java.util.Date;

public class CallEmi extends Call {

    @Override
    public double cout() {
        return duree * 2;
    }

    public CallEmi(int number, Date callDate, double duree) {
        super(number, callDate, duree);
    }

    public CallEmi() {
        super();
    }
}
