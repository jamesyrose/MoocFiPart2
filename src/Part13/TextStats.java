package Part13;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextStats extends Application{
    public static String removeNonAlphanumeric(String str) { 
    	str = str.replaceAll("[^a-zA-Z0-9]", ""); 
      	return str;
    } 

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextArea field = new TextArea("");
		Label label =  new Label("");
		
		field.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> change, 
					String oldVal, String texts) {
                String[] splitWords = texts.split(" ");
                int longestLen = 0;
                int wordCount = 0; 
                int letterCount = 0;
                String longWord = "";
                for (String word: splitWords) {
                	word = removeNonAlphanumeric(word);
                	wordCount++;
                	letterCount += word.length();
                	if (word.length() > longestLen) {
                		longestLen = word.length();
                		longWord = word;
                	}
                }
                String response = String.format("Words: %s    "
                		+ "Letters: %s  "
                		+ " Longest:  %s", wordCount, letterCount, longWord);
				label.setText(response);
			}	
		});
		
		VBox comp = new VBox();
		comp.setSpacing(10);
		comp.getChildren().addAll(field, label);
		
		Scene  scene = new Scene(comp);
		
		primaryStage.setTitle("String Counter");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
