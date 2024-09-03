import java.time.LocalDate;
import java.time.LocalTime;

public class DomesticFlight extends Flight {
    public DomesticFlight(String flightCode, String departure, String destination, double price, LocalDate flightDate, LocalTime departTime) {
        super(flightCode, departure, destination, price, flightDate, departTime);
    }
}
