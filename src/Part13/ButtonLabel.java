package Part13;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ButtonLabel extends Application {

	@Override
	public void start(Stage Window) throws Exception {
		Button btn = new Button("Click this!!!");
		Label label = new Label("Heres a Button");
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("You clicked it !");
            }
        });
		
		HBox root = new HBox();
		
		root.getChildren().addAll(label, btn);
		
		Scene view = new Scene(root);
		Window.setScene(view);
		Window.show();
	}

	
	public static void main(String[] args) {
		launch();
	}
}
