package Part13;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FancyApp extends Application {
    @Override
    public void start(Stage window) {
    	Label words = new Label("Words: 0");
    	Label letters = new Label("Letters: 0");
    	Label longest = new Label("Longest: 0");
        BorderPane layout = new BorderPane();

        HBox buttons = new HBox();
        TextArea text = new TextArea("");
        text.setText("Enter Some Stuff Here");
        buttons.setSpacing(10);
        Button txtBtn = new Button("Get Counts");
        txtBtn.setOnAction(new EventHandler<ActionEvent>() {
			 
            @Override
            public void handle(ActionEvent event) {
            	String texts = text.getText();
                String[] splitWords = texts.split(" ");
                int longestLen = 0;
                int wordCount = 0; 
                int letterCount = 0;
                for (String word: splitWords) {
                	wordCount++;
                	letterCount += word.length();
                	if (word.length() > longestLen) {
                		longestLen = word.length();
                	}
                }
                words.setText("Words: " + wordCount);
                letters.setText("Letters: "  + letterCount);
                longest.setText("Longest: " + longestLen);
            }
        });
        
        
        buttons.getChildren().add(txtBtn);

        VBox texts = new VBox();
        texts.setSpacing(10);
        texts.getChildren().add(words);
        texts.getChildren().add(letters);
        texts.getChildren().add(longest);

        layout.setTop(buttons);
        layout.setLeft(texts);

        layout.setCenter(text);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch();
    }
}