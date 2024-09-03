/**
 * class seat
 */
public class Seat {
    private String seatNumber;

    /**
     *
     * @param seatNumber
     * String seatNumber
     */
    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     *
     * @return get seat info
     */
    public String getSeatInfo() {
        return "Seat: " + seatNumber;
    }
}
