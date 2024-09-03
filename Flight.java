/**
 * @author simji
 * This show the blueprint of Flight Booking System
 */
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * class Flight
 */
public abstract class Flight {
    /**
     *
     */
    protected String flightCode;
    /**
     *
     */
    protected String departure;
    /**
     *
     */
    protected String destination;
    /**
     *
     */
    protected LocalDate flightDate;
    /**
     *
     */
    protected LocalTime departTime;
    /**
     *
     */
    protected double price;

    /**
     *
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
    public Flight(String flightCode, String departure, String destination, double price, LocalDate flightDate, LocalTime departTime) {
        this.flightCode = flightCode;
        this.departure = departure;
        this.destination = destination;
        this.flightDate = flightDate;
        this.departTime = departTime;
        this.price = price;
    }
    
    /**
     *
     * @return get Flight Info
     */
    public String getFlightInfo() {
        return String.format("Flight: %s\nDeparture: %s\nDestination: %s\nDate: %s\nDepart Time: %s\nPrice: RM %.2f",
                flightCode, departure, destination, flightDate, departTime, price);
    }

    /**
     *
     * @return Flight Date
     */
    public LocalDate getFlightDate() {
        return flightDate;
    }

    /**
     *
     * @param flightDate
     * LocalDate flightDate
     */
    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    /**
     *
     * @return Depart Time
     */
    public LocalTime getDepartTime() {
        return departTime;
    }

    /**
     *
     * @param departTime
     * LocalTime departTime
     */
    public void setDepartTime(LocalTime departTime) {
        this.departTime = departTime;
    }

    /**
     *
     * @return Departure destination and time
     */
    @Override
    public String toString() {
        return departure + " to " + destination + " at " + departTime.toString();
    }
}
