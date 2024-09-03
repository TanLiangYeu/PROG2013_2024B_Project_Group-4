public class Seat {
    private String seatNumber;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatInfo() {
        return "Seat: " + seatNumber;
    }
}
