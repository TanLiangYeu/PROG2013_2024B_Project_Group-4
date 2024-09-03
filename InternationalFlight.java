/**
 * @author simji
 * This show the blueprint of Flight Booking System
 */
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * class international Flight
 */
public class InternationalFlight extends Flight {

    /**
     * International Flight
     * @param flightCode
     * String flightCode
     * @param departure
     * String departure
     * @param destination
     * String destination
     * @param price
     * double price
     * @param flightDate
     * LocalDate flightDate
     * @param departTime
     * LocalTime departTime
     */
    public InternationalFlight(String flightCode, String departure, String destination, double price, LocalDate flightDate, LocalTime departTime) {
        super(flightCode, departure, destination, price, flightDate, departTime);
    }
}
