package Part14;

import java.awt.GridLayout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Collage extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Image imgFile = new Image("https://media.npr.org/assets/img/2012/02/02/mona-lisa-copy_custom-cf935c261c640b9ff7e214059a0328c880c22f50-s800-c85.jpg");
	    double width = imgFile.getWidth();
	    double height = imgFile.getHeight();

	    ImageView image = new ImageView(imgFile);
	    image.setScaleX(0.5);
	    image.setScaleY(0.5);
	    image.setTranslateX(-width/4);
	    image.setTranslateY(-height/4);
	    
	    ImageView image2 = new ImageView(imgFile);
	    image2.setScaleX(0.5);
	    image2.setScaleY(0.5);
	    image2.setTranslateX(width/4);
	    image2.setTranslateY(-height/4);
	    
	    ImageView image3 = new ImageView(imgFile);
	    image3.setScaleX(0.5);
	    image3.setScaleY(0.5);
	    image3.setTranslateX(-width/4);
	    image3.setTranslateY(height/4);
	     
	    ImageView image4 = new ImageView(imgFile);
	    image4.setScaleX(0.5);
	    image4.setScaleY(0.5);
	    image4.setTranslateX(width/4);
	    image4.setTranslateY(height/4);
	    
	    
	    
	    Pane frame = new Pane();
	    frame.getChildren().addAll(image, image2, image3, image4);

	    stage.setScene(new Scene(frame));
	    stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
 
}
