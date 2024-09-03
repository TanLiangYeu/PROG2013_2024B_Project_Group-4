public class Booking {
    private Flight flight;
    private Passenger passenger;
    private Seat seat;

    public Booking(Flight flight, Passenger passenger, Seat seat) {
        this.flight = flight;
        this.passenger = passenger;
        this.seat = seat;
    }

    public String getBookingInfo() {
        return "Booking Successful!\n\n-Flight Information-\n" + flight.getFlightInfo() + "\n\n-Selected Seat-\n" + seat.getSeatInfo() + "\n\n-Passenger Information-\n" + passenger.getPassengerInfo();
    }
}
