/**
 * @author simji
 * This show the blueprint of Flight Booking System
 */
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * This show the blueprint of flight Booking System
 * @author simji
 */
public class FlightBookingSystem extends Application {
    /**
     * @param primaryStage
     * Flight Booking System
     */
    @Override
    public void start(Stage primaryStage) {
        FlightTypeSelectionPage flightTypeSelectionPage = new FlightTypeSelectionPage(primaryStage);
        primaryStage.setScene(flightTypeSelectionPage.getScene());
        primaryStage.setTitle("Flight Booking System");
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
