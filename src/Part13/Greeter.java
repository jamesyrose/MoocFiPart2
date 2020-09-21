package Part13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Greeter extends Application{

	@Override
	public void start(Stage window) throws Exception {
		// First Window Elements
		Button start = new Button("Start");
		TextField text = new TextField();
		Label label = new Label("Enter Your Name");
		
		// Second window text
		Label message = new Label("Welcome");
		
		// Initiate First Structure
		VBox firstWindow = new VBox();
		firstWindow.getChildren().addAll(label, text, start);
		
		// Initiate Second Structure
		VBox secondWindow = new VBox();
		secondWindow.getChildren().add(message);
		
		// Makes Scenes
		Scene first = new Scene(firstWindow);
		Scene second = new Scene(secondWindow);
		
		// Button Action
		start.setOnAction((event) ->{
			message.setText("Welcome " + text.getText() + "!"); 
			window.setScene(second);}
			);
		
		window.setScene(first);
		window.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}
