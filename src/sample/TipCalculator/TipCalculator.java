package sample.TipCalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TipCalculator extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("TipCalculator.fxml"));
        primaryStage.setTitle("Tip Calculator");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

//--module-path "C:\Users\beknazar.jumabaev\Desktop\5th year\OOP\final\javafx-sdk-11.0.2\lib" --add-modules=javafx.controls,javafx.fxml