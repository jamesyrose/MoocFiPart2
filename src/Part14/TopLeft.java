package Part14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TopLeft extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Image imgFile = new Image("https://media.npr.org/assets/img/2012/02/02/mona-lisa-copy_custom-cf935c261c640b9ff7e214059a0328c880c22f50-s800-c85.jpg");
	    double width = imgFile.getWidth();
	    double height = imgFile.getHeight();

	    ImageView image = new ImageView(imgFile);
	    
	    ImageView image2 = new ImageView(imgFile);
	    image2.setScaleX(0.5);
	    image2.setScaleY(0.5);
	    image2.setTranslateX(-width/4);
	    image2.setTranslateY(-height/4);
	    

	    
	    
	    
	    Pane frame = new Pane();
	    frame.getChildren().addAll(image, image2);

	    stage.setScene(new Scene(frame));
	    stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
