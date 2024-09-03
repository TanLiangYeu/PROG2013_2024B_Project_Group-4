/**
 * @author simji
 * This show the blueprint of Flight Booking System
 */
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;

/**
 * class passenger info page
 */
public class PassengerInfoPage {
    private Scene scene;
    private TextField nameTF, icTF, numberTF;

    /**
     *
     * @param stage
     * Stage stage
     * @param selectedFlight
     * Flight selectedFlight
     * @param selectedSeat
     * String selectedSeat
     * @param seatSelectionPage
     * SeatSelectionPage seatSelectionPage
     */
    public PassengerInfoPage(Stage stage, Flight selectedFlight, String selectedSeat, SeatSelectionPage seatSelectionPage) {
        Label nameL = new Label("Name:");
        nameTF = new TextField();

        Label icL = new Label("IC/Passport No:");
        icTF = new TextField();

        Label numberL = new Label("Phone Number:");
        numberTF = new TextField();

        Button nextButton = new Button("Next");
        nextButton.setOnAction(event -> {
            if (!nameTF.getText().isEmpty() && !icTF.getText().isEmpty() && !numberTF.getText().isEmpty()) {
                Passenger passenger = new Passenger(nameTF.getText(), icTF.getText(), numberTF.getText());
                Booking booking = new Booking(selectedFlight, passenger, new Seat(selectedSeat));
                BookingResultPage resultPage = new BookingResultPage(stage, booking);
                stage.setScene(resultPage.getScene());
            }
        });

        Button backButton = new Button("Back");
        backButton.setOnAction(event -> {
            stage.setScene(seatSelectionPage.getScene());
        });

        HBox buttonLayout = new HBox(10, backButton, nextButton);

        VBox layout = new VBox(10, nameL, nameTF, icL, icTF, numberL, numberTF, buttonLayout);
        layout.setPadding(new Insets(10));

        scene = new Scene(layout, 290, 240);
    }

    /**
     *
     * @return scene
     */
    public Scene getScene() {
        return scene;
    }
}
