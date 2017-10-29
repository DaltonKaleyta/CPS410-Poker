/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allinpoker;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Kaleyta
 */
public class StartScreenController implements Initializable {

    @FXML
    private Label usernameStatus;
    @FXML
    private Label connectionStatus;
    @FXML
    private TextField tfUsername;
    
    private String FXMLPATH = "StartScreen.fxml";
    private String username;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public Parent getFXML()throws IOException{
        return FXMLLoader.load(getClass().getResource(FXMLPATH));
    }
    
    @FXML
    private boolean checkUsername(){
        username = tfUsername.getText();
        System.out.println(username);
        //check username agaisnt those used
        //if successful
            usernameStatus.setStyle("-fx-text-fill: #00D800");
            usernameStatus.setText("Username is Available");
        //else
            usernameStatus.setStyle("-fx-text-fill: #E50000");
            usernameStatus.setText("Username is Unavailable");
        return true;
    }
    
    @FXML
    private void connectToLobby() throws IOException{
        if(checkUsername()){
            Stage stage = (Stage) usernameStatus.getScene().getWindow();
            //try to connect
            //change to lobby scene
            LobbyController lobby = new LobbyController();
            stage.setScene(new Scene(lobby.getFXML()));
        }
        
        
    }
    
    @FXML
    private void startOfflineGame(){
        try{
            Stage stage = (Stage) usernameStatus.getScene().getWindow();
            GameScreenController gameScreen = new GameScreenController();
            stage.setScene(new Scene(gameScreen.getFXML()));
        }catch (Exception ex){
            Logger.getLogger(AllInPoker.class.getName()).log(Level.SEVERE, null, ex);  
        }
    }
    
    @FXML
    private void exitGame(){
        
    }
    
}
