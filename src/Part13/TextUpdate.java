package Part13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextUpdate extends Application{

	@Override
	public void start(Stage window) throws Exception {
		TextField text = new TextField("");
		Button btn = new Button("Update!");
		Label label = new Label("");
		btn.setOnAction((event) -> label.setText(text.getText()));
		
		VBox comp = new VBox();
		comp.setSpacing(10);
		comp.getChildren().addAll(text, btn, label);
		
		Scene scene = new Scene(comp);
		window.setScene(scene);
		window.show();
	}
	
	
	public static void main(String[] args) {
		launch();
	}
	

}
