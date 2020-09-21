package Part13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

	@Override
	public void start(Stage window) throws Exception {
		// Labels 
		Label firstLabel = new Label("First View");
		Label secondLabel = new Label("Second View");
		Label thirdLabel =  new Label("Third View");
		
		// Buttons 
		Button toFirstView = new Button("To First View");
		Button toSecondView = new Button("To Second View");
		Button toThirdView = new Button("To Third View");
		Button toFirstView2 = new Button("To First View");
		Button toSecondView2 = new Button("To Second View");
		Button toThirdView2 = new Button("To Third View");
		
		// VBoxes 
		VBox first = new VBox();
		VBox second = new VBox();
		VBox third = new VBox();

		// Set Spacing
		first.setSpacing(10);
		second.setSpacing(10);
		third.setSpacing(10);

		
		// Set Components
		first.getChildren().addAll(firstLabel, toSecondView, toThirdView);
		second.getChildren().addAll(secondLabel, toFirstView, toThirdView2);
		third.getChildren().addAll(thirdLabel, toFirstView2, toSecondView2);

		// Create Scenes
		Scene firstScene = new Scene(first);
		Scene secondScene = new Scene(second);
		Scene thirdScene = new Scene(third);
		
		// set button action
		toFirstView.setOnAction((event) -> window.setScene(firstScene));
		toSecondView.setOnAction((event) -> window.setScene(secondScene));
		toThirdView.setOnAction((event) -> window.setScene(thirdScene));
		toFirstView2.setOnAction((event) -> window.setScene(firstScene));
		toSecondView2.setOnAction((event) -> window.setScene(secondScene));
		toThirdView2.setOnAction((event) -> window.setScene(thirdScene));
		
		// Set Window
		window.setScene(firstScene);
		window.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
