package alexis;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BDFXM extends Application {

	public static void main(String[] args) {
	
			launch(args);
	}
	public void start(Stage primaryStage) throws Exception {
		AnchorPane root= FXMLLoader.load(getClass().getResource("MyBooks.fxml"));

Scene sc= new Scene(root);

primaryStage.setScene(sc);
primaryStage.setTitle("Book shelf");
primaryStage.show();
		}
		

}
