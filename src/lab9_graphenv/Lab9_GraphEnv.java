package lab9_graphenv;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Git Repository: https://github.com/jameshuyha/Lab9_GraphEnv.git
 * @author Huy James Vien Ha (6324151)
 */
public class Lab9_GraphEnv extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
        
        stage.setTitle("Menu Example");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
