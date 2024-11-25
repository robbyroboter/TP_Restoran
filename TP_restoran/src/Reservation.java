import java.util.Date;

public class Reservation {
    private Date time;
    private int numberOfPeople;
    private String reservationType;

    public Reservation(Date time, int numberOfPeople, String reservationType) {
        this.time = time;
        this.numberOfPeople = numberOfPeople;
        this.reservationType = reservationType;
    }

    @Override
    public String toString() {
        return "Reservation{" + "time='" + time + "', numberOfPeople=" + numberOfPeople + ", reservationType='" + reservationType + "'}";
    }
}
