/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allinpoker;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kaleyta
 */
public class GameScreenController implements Initializable {

    @FXML
    private TextField chatInput;
    
    String FXMLPATH = "GameScreen.fxml";
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    public Parent getFXML()throws IOException{
        return FXMLLoader.load(getClass().getResource(FXMLPATH));
    }
    
    @FXML
    private void leaveTable() throws IOException{
            Stage stage = (Stage)chatInput.getScene().getWindow();
            
            LobbyController lobby = new LobbyController();
            stage.setScene(new Scene(lobby.getFXML()));
        
        
    }
    
}
