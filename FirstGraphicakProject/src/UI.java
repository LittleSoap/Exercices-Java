import javafx.application.Application;
import javafx.stage.Stage;

public class UI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        primaryStage.setTitle("Vive le Java !");
        primaryStage.show();
    }
}
