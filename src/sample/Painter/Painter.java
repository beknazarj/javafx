package sample.Painter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Painter extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Painter.fxml"));
        Scene scene=new Scene(root);
        stage.setTitle("Painter Application");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args){
        launch(args);
    }
}



// Run -> Edit Configurations -> VM Options -> --module-path "C:\Users\beknazar.jumabaev\Desktop\5th year\OOP\final\javafx-sdk-11.0.2\lib" --add-modules=javafx.controls,javafx.fxml
