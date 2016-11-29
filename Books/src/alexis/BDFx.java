package alexis;


import java.util.Optional;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.*;
import javafx.scene.control.Alert; 
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;



public class BDFx {

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private TextField sum;

    @FXML
    private TextField tb2;

    @FXML
    private TextArea tb4;

    @FXML
    private TextArea tb1;

    @FXML
    private TextArea tb3;

    @FXML
    private TextArea tb5;

  
	@SuppressWarnings("restriction")
	
	@FXML
void rightclick() {
    	//if(event.getButton()==MouseButton.SECONDARY){
    		//making
    		//Button b=(Button)event.getSource();
    		Alert bookinfo= new Alert(AlertType.CONFIRMATION);
    		bookinfo.setHeaderText("Tell me the title of your book,");
    		bookinfo.setTitle("change book Book");
    		bookinfo.setContentText(null);
    		// making the table
    		GridPane table= new GridPane();
    		table.setHgap(10);
    		table.setVgap(10);
    		table.setPadding(new Insets(20,150,0,10));
    		TextField bookin= new TextField();
    		// puting info in alert
    		//bookin.setText(b.getText());
    		table.add(bookin,0,0);
    		bookinfo.getDialogPane().setContent(table);
    		Optional<ButtonType>result=bookinfo.showAndWait();
    		if(result.isPresent()){
    			if(result.get()==ButtonType.OK){
    				bookinfo.setTitle(bookin.getText());
    			}
    		}
    	//}

    }

}