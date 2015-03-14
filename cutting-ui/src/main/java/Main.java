import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * Created by Morgan on 11/03/2015.
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Main.class.getResource("main.fxml"));
        Scene scene = getScene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Scene getScene(Parent root) {
        Rectangle2D screen = Screen.getPrimary().getBounds();
        return new Scene(root, screen.getWidth() * 0.9, screen.getHeight() * 0.9);
    }
}