package Part13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Joke extends Application{

	@Override
	public void start(Stage window) throws Exception {
		// Button
		Button joke = new Button("Joke");
		Button answer = new Button("Answer");
		Button explanation = new Button("Explanation");
		
		// Label 
		Label response = new Label("");
		
		// Button Response
		joke.setOnAction((event) -> response.setText("What do you call a toothless bear?")); 
		answer.setOnAction( (event)  -> response.setText("A  Gummy Bear"));
		explanation.setOnAction((event) -> response.setText("Because it only has gums")); 
		
		// Hbox
		HBox options = new HBox();
		options.setSpacing(20);
		options.getChildren().addAll(joke, answer, explanation);
		
		// layout 
        BorderPane layout = new BorderPane();
        layout.setTop(options);
        layout.setBottom(response);
        
        // Scene 
        Scene  scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
        
	}	
	
	public static void main(String[] args) {
		launch();
	}
	

}
