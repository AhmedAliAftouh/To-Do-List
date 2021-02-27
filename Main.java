package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.controller.DatabaseHandler;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
         /*
        parent-> is  The base class for all nodes that have children in the scene graph.
        This class handles all hierarchical scene graph operations, including adding/
        removing child nodes, marking branches dirty for layout
        and rendering, picking, bounds calculations,
        and executing the layout pass on each pulse.
        */
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/login.fxml"));
       // Parent root = FXMLLoader.load(getClass().getResource("/sample/view/AddItem.fxml"));
        primaryStage.setTitle("TO DO LIST");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
