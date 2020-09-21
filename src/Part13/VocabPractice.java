package Part13;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class VocabPractice extends Application {
	private Dictionary dict;

	@Override
	public void start(Stage window) throws Exception {
		// Starting dict
		dict  = new Dictionary();		
		
		// Buttons 
		Button practice = new Button("Practice");
		Button newWords = new Button("Enter New Words");
		Button add = new Button("Add Word");
		Button translate = new Button("Translate");
		
		// Text Fields
		TextField word = new TextField("");
		TextField word2 = new TextField("");

		TextField trans = new TextField("");
		TextField key = new TextField("");
		
		// Label
		Label  wordLabel = new Label("Word");
		Label  wordLabel2 = new Label("Word");
		Label transLabel = new Label("Translation");
		Label translation = new Label("");
		
		// Grid  first one
		GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));
		grid.add(practice, 0, 0);
		grid.add(wordLabel, 0, 1);
		grid.add(word, 1, 1);
		grid.add(transLabel,  0,  2);
		grid.add(trans, 1, 2);
		grid.add(add, 1, 3);
		
		// Grid second one 
		GridPane grid2 = new GridPane();
        grid2.setHgap(10);
        grid2.setVgap(10);
        grid2.setPadding(new Insets(10, 10, 10, 10));
		grid2.add(newWords, 0, 0);
		grid2.add(wordLabel2, 0, 1);
		grid2.add(word2, 1, 1);
		grid2.add(translate, 1, 2);
		grid2.add(translation, 1, 3);
		
		// Scene
		Scene addScene = new Scene(grid);
		Scene transScene = new Scene(grid2);
		
		//  Actions
		practice.setOnAction((event) -> window.setScene(transScene));
		newWords.setOnAction((event) -> window.setScene(addScene));
		add.setOnAction((event) ->  { 
			String wordKey = word.getText();
			String value = trans.getText();
			this.dict.putTranslation(wordKey, value);
		});
		
		translate.setOnAction((event -> {
			String wordKey = word2.getText();
			if (this.dict.containsKey(wordKey)) {
				translation.setText(this.dict.getTranslation(wordKey));
			}else {
				translation.setText("No Translation");
			}
		}));
	
		// set window
		window.setScene(addScene);
		window.setTitle("Vocab Study");
		window.show();
	}
	
	public static void main(String[] args) {
		launch();
	}


}
