/**
 * class Passenger
 */
public class Passenger {
    private String name;
    private String icNumber;
    private String phoneNumber;

    /**
     *
     * @param name
     * String name
     * @param icNumber
     * String icNumber
     * @param phoneNumber
     * String phoneNumber
     */
    public Passenger(String name, String icNumber, String phoneNumber) {
        this.name = name;
        this.icNumber = icNumber;
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @return Name, IC, Phone Number
     */
    public String getPassengerInfo() {
        return "Name: " + name + "\nIC/Passport No: " + icNumber + "\nPhone Number: " + phoneNumber;
    }
}
