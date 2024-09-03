import java.time.LocalDate;
import java.time.LocalTime;

public class InternationalFlight extends Flight {
    public InternationalFlight(String flightCode, String departure, String destination, double price, LocalDate flightDate, LocalTime departTime) {
        super(flightCode, departure, destination, price, flightDate, departTime);
    }
}
