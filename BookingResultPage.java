import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
     /**
     * class Booking Result
     */

public class BookingResultPage {
    private Scene scene;
          /**
          *
          * @param stage
          * Booking Result
          * @param booking
          * text-fill: green
          */
        public BookingResultPage(Stage stage, Booking booking) {
        TextArea infoTA = new TextArea(booking.getBookingInfo());
        infoTA.setEditable(false);
        infoTA.setMaxWidth(300);
        infoTA.setMaxHeight(200);

        Label resultL = new Label("Booking Result");
        resultL.setStyle("-fx-font-size: 15px;-fx-text-fill: green;");

        VBox layout = new VBox(10, resultL, infoTA);
        layout.setPadding(new Insets(10));

        scene = new Scene(layout, 290, 250);
    }
    
        /**
         *
         * @return scene
         */

    public Scene getScene() {
        return scene;
    }
}
