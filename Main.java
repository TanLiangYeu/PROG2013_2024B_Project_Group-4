import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        FlightTypeSelectionPage flightTypeSelectionPage = new FlightTypeSelectionPage(primaryStage);
        primaryStage.setScene(flightTypeSelectionPage.getScene());
        primaryStage.setTitle("Flight Booking System");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
