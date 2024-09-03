import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Flight {
    protected String flightCode;
    protected String departure;
    protected String destination;
    protected LocalDate flightDate;
    protected LocalTime departTime;
    protected double price;

    public Flight(String flightCode, String departure, String destination, double price, LocalDate flightDate, LocalTime departTime) {
        this.flightCode = flightCode;
        this.departure = departure;
        this.destination = destination;
        this.flightDate = flightDate;
        this.departTime = departTime;
        this.price = price;
    }

    public String getFlightInfo() {
        return String.format("Flight: %s\nDeparture: %s\nDestination: %s\nDate: %s\nDepart Time: %s\nPrice: RM %.2f",
                flightCode, departure, destination, flightDate, departTime, price);
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    public LocalTime getDepartTime() {
        return departTime;
    }

    public void setDepartTime(LocalTime departTime) {
        this.departTime = departTime;
    }

    @Override
    public String toString() {
        return departure + " to " + destination + " at " + departTime.toString();
    }
}
