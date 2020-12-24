package sample.TipCalculationMod;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class TipCalculationMod extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TipCalculationMod.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.setTitle("Tip Calculation Modified"); // Displayed in window's title bar
        stage.show();
    }
}


// Run -> Edit Configurations -> VM Options -> --module-path "C:\Users\beknazar.jumabaev\Desktop\5th year\OOP\final\javafx-sdk-11.0.2\lib" --add-modules=javafx.controls,javafx.fxml

