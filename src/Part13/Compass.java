package Part13;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Compass extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        Label north = new Label("north");
        layout.setTop(north);
        layout.setAlignment(north, Pos.CENTER);
        layout.setRight(new Label("east"));
        Label south = new Label("south");
        layout.setBottom(south);
        layout.setAlignment(south, Pos.CENTER);
        layout.setLeft(new Label("west"));

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch();
    }
}