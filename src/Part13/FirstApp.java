package Part13;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class FirstApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say Hello");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello Everybody!!!");
            }
        });
        
        
        Button goodBye = new Button();
        goodBye.setText("Say Bye");
        goodBye.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Bye Everybody!!!");
            }
        });
        
        VBox root = new VBox();
        root.getChildren().addAll(btn, goodBye);
        
        Scene scene = new Scene(root, 200, 200);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
 public static void main(String[] args) {
        launch(args);
    }
}