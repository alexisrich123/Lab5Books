package alexis;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Parent;
public class BDFXM extends Application {
	public void start(Stage primaryStage) throws Exception {
		Parent root= FXMLLoader.load(getClass().getResource("MyBooks.fxml"));

Scene sc= new Scene(root);

primaryStage.setScene(sc);
primaryStage.setTitle("Book shelf");
primaryStage.show();
		}
	public static void main(String[] args) {
	
			launch(args);
	}

		

}
