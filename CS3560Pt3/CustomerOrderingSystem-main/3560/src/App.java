import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {
    Scene mainScene, menuScene, foodScene, drinkScene;
    Stage window;
    MainPage mainPage;
    Menu menuPage;
    Pane pane1, pane2;
    //PizzaAndSidesPage foodPage;
    //DrinksPage drinkPage;

    public App(){
        mainPage = new MainPage();
        menuPage = new Menu();
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            
            window = primaryStage;

            Parent mainRoot = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
            mainScene = new Scene(mainRoot);

            window.setTitle("Test");
            window.setScene(mainScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setScene(Scene scene) {
        window.setScene(scene);
    }
 
 public static void main(String[] args) {
        launch(args);
    }
}
