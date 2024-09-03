/**
 * @author simji
 * This show the blueprint of Flight Booking System
 */
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.geometry.Insets;

/**
 * class seat selection page
 */
public class SeatSelectionPage {
    private Scene scene;
    private RadioButton selectedSeatRB;

    /**
     *
     * @param stage
     * Stage stage
     * @param selectedFlight
     * Flight selectedFlight
     * @param flightSelectionPage
     * FlightSelectionPage flightSelectionPage
     */
    public SeatSelectionPage(Stage stage, Flight selectedFlight, FlightSelectionPage flightSelectionPage) {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        int numRows = 12;
        int numCols = 4;
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                RadioButton seat = new RadioButton((col + 1) + "-" + (row + 1));
                gridPane.add(seat, col, row);

                seat.setOnAction(event -> {
                    selectedSeatRB = seat;
                    for (Node node : gridPane.getChildren()) {
                        if (node instanceof RadioButton && node != seat) {
                            ((RadioButton) node).setSelected(false);
                        }
                    }
                });
            }
        }

        Label instructionLabel = new Label("Please select a seat");

        Button nextButton = new Button("Next");
        nextButton.setOnAction(event -> {
            if (selectedSeatRB != null) {
                PassengerInfoPage passengerInfoPage = new PassengerInfoPage(stage, selectedFlight, selectedSeatRB.getText(), this);
                stage.setScene(passengerInfoPage.getScene());
            }
        });

        Button backButton = new Button("Back");
        backButton.setOnAction(event -> {
            stage.setScene(flightSelectionPage.getScene());
        });

        HBox buttonLayout = new HBox(10, backButton, nextButton);

        VBox layout = new VBox(10, instructionLabel, gridPane, buttonLayout);
        layout.setPadding(new Insets(10));

        scene = new Scene(layout, 290, 400);
    }

    /**
     *
     * @return scene
     */
    public Scene getScene() {
        return scene;
    }
}
