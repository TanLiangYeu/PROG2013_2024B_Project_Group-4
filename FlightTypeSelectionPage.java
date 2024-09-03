/**
 * @author simji
 * This show the blueprint of Flight Booking System
 */
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.time.LocalDate;

/**
 * class flight type selection page
 */
public class FlightTypeSelectionPage {
    private Scene scene;
    private LocalDate selectedDate;
    private boolean isDomestic;

    /**
     * @param stage
     * class Flight Type Selection Page
     */
    public FlightTypeSelectionPage(Stage stage) {
        Label instructionLabel = new Label("Please select a date:");

        DatePicker datePicker = new DatePicker();
        datePicker.setEditable(false);
        datePicker.setPromptText("Select a date");
        datePicker.setOnAction(event -> selectedDate = datePicker.getValue());

        Label flightTypeLabel = new Label("Please select the flight type:");
        ToggleGroup flightTypeGroup = new ToggleGroup();
        RadioButton domesticRB = new RadioButton("Domestic (Malaysia Only)");
        domesticRB.setToggleGroup(flightTypeGroup);
        RadioButton internationalRB = new RadioButton("International");
        internationalRB.setToggleGroup(flightTypeGroup);

        domesticRB.setSelected(true);
        isDomestic = true;

        flightTypeGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            isDomestic = domesticRB.isSelected();
        });

        Button nextButton = new Button("Next");
        nextButton.setOnAction(event -> {
            if (selectedDate != null) {
                FlightSelectionPage flightSelectionPage = new FlightSelectionPage(stage, selectedDate, isDomestic, this);
                stage.setScene(flightSelectionPage.getScene());
            }
        });

        VBox layout = new VBox(10, instructionLabel, datePicker, flightTypeLabel, domesticRB, internationalRB, nextButton);
        layout.setPadding(new javafx.geometry.Insets(10));

        scene = new Scene(layout, 290, 200);
    }

    /**
     * 
     * @return scene
     */
    public Scene getScene() {
        return scene;
    }
}
