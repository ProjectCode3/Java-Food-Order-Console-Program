import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.Node;

public class MainPage{
    private Scene scene;
    private Stage stage;
    
    @FXML
    void goToLogInPage(ActionEvent event) {

    }

    @FXML
    void goToMenu(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void gotToAccountPage(ActionEvent event) {

    }

}
