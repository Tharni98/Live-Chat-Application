import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Client1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("view/loginForm.fxml"));
        primaryStage.setTitle("LiveChat");
        primaryStage.setScene(new Scene(root, 400, 600));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
