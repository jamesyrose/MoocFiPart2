package Part14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class MakeSounds extends Application {

	@Override
	public void start(Stage window) throws Exception {
		// Buttons 
		Button soundBtn = new Button("Applause");
		
		// Sound 
		AudioClip sound = new AudioClip("file:sound.wav");
		
		// Action
		soundBtn.setOnAction((event) -> sound.play());
		
		Scene scene= new Scene(soundBtn, 400, 400);
		
		
		
		window.setScene(scene);
		window.show();
		
	}

	
	public static void main(String[] args) {
		launch();
	}

}
