public class Passenger {
    private String name;
    private String icNumber;
    private String phoneNumber;

    public Passenger(String name, String icNumber, String phoneNumber) {
        this.name = name;
        this.icNumber = icNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getPassengerInfo() {
        return "Name: " + name + "\nIC/Passport No: " + icNumber + "\nPhone Number: " + phoneNumber;
    }
}
