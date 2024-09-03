import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.LocalTime;

public class FlightSelectionPage {
    private Flight selectedFlight;
    private Scene scene;

    public FlightSelectionPage(Stage stage, LocalDate selectedDate, boolean isDomestic, FlightTypeSelectionPage flightTypeSelectionPage) {
        ComboBox<Flight> flightCB = new ComboBox<>();
        
        if (isDomestic) {
            flightCB.getItems().addAll(
                new DomesticFlight("M256", "Kuala Lumpur Airport", "Senai Airport", 143.00, selectedDate, LocalTime.of(10, 30)),
                new DomesticFlight("M234", "Kuala Lumpur Airport", "Senai Airport", 143.00, selectedDate, LocalTime.of(17, 00)),
                new DomesticFlight("M227", "Senai Airport", "Pulau Penang Airport", 353.00, selectedDate, LocalTime.of(13, 00)),
                new DomesticFlight("M214", "Senai Airport", "Pulau Penang Airport", 353.00, selectedDate, LocalTime.of(19, 00)),
                new DomesticFlight("M672", "Kota Kinabalu Airport", "Pulau Penang Airport", 898.00, selectedDate, LocalTime.of(13, 00)),
                new DomesticFlight("M112", "Kota Kinabalu Airport", "Pulau Penang Airport", 898.00, selectedDate, LocalTime.of(19, 00)),
                new DomesticFlight("M234", "Senai Airport", "Kuching Airport", 513.00, selectedDate, LocalTime.of(11, 00)),
                new DomesticFlight("M894", "Senai Airport", "Kuching Airport", 513.00, selectedDate, LocalTime.of(19, 00))
            );
        } else {
            flightCB.getItems().addAll(
                new InternationalFlight("G625", "Kuala Lumpur Airport", "Bangkok Airport", 580.00, selectedDate, LocalTime.of(13, 45)),
                new InternationalFlight("R542", "Kuala Lumpur Airport", "Tokyo Airport", 2002.00, selectedDate, LocalTime.of(18, 15)),
                new InternationalFlight("U761", "Kuala Lumpur Airport", "London Airport", 3324.00, selectedDate, LocalTime.of(12, 00)),
                new InternationalFlight("G162", "Kuala Lumpur Airport", "New York Airport", 4427.00, selectedDate, LocalTime.of(15, 00)),
                new InternationalFlight("F452", "Senai Airport", "Jakarta Airport", 474.00, selectedDate, LocalTime.of(19, 25)),
                new InternationalFlight("F672", "Senai Airport", "Seoul Airport", 3941.00, selectedDate, LocalTime.of(20, 00)),
                new InternationalFlight("P922", "Senai Airport", "Paris Airport", 4322.00, selectedDate, LocalTime.of(17, 30)),
                new InternationalFlight("L872", "Senai Airport", "Berlin Airport", 5259.00, selectedDate, LocalTime.of(18, 00))
            );
        }
        
        flightCB.setPromptText("Please select a flight");

        TextArea flightTA = new TextArea();
        flightTA.setEditable(false);
        flightTA.setMaxWidth(320);
        flightTA.setMaxHeight(110);

        flightCB.setOnAction(event -> {
            selectedFlight = flightCB.getSelectionModel().getSelectedItem();
            if (selectedFlight != null) {
                flightTA.setText(selectedFlight.getFlightInfo());
            }
        });

        Label instructionLabel = new Label("Please select a flight");

        Button nextButton = new Button("Next");
        nextButton.setOnAction(event -> {
            if (selectedFlight != null) {
                SeatSelectionPage seatSelectionPage = new SeatSelectionPage(stage, selectedFlight, this);
                stage.setScene(seatSelectionPage.getScene());
            }
        });

        Button backButton = new Button("Back");
        backButton.setOnAction(event -> {
            stage.setScene(flightTypeSelectionPage.getScene());
        });

        HBox buttonLayout = new HBox(10, backButton, nextButton);

        VBox layout = new VBox(10, instructionLabel, flightCB, flightTA, buttonLayout);
        layout.setPadding(new javafx.geometry.Insets(10));

        scene = new Scene(layout, 290, 240);
    }

    public Scene getScene() {
        return scene;
    }
}
