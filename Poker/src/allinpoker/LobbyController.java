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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kaleyta
 */
public class LobbyController implements Initializable {

    @FXML
    private Label lobbyHeader;
    @FXML
    private TableView table;
    
 
    private String FXMLPATH = "Lobby.fxml";
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        loadGames();
    }    
    
    public Parent getFXML()throws IOException{
        return FXMLLoader.load(getClass().getResource(FXMLPATH));
    }
    
    private void loadGames(){
        
    }

    @FXML
    private void btnBackHandler(){
        try{
            Stage stage = (Stage) lobbyHeader.getScene().getWindow();
            StartScreenController startScreen = new StartScreenController();
            stage.setScene(new Scene(startScreen.getFXML()));
        }catch (Exception ex){
            Logger.getLogger(AllInPoker.class.getName()).log(Level.SEVERE, null, ex);  
        }
    }
    
    @FXML
    private void createNewGame(){
        
        try{
            Stage stage = (Stage) lobbyHeader.getScene().getWindow();
            GameScreenController gameScreen = new GameScreenController();
            stage.setScene(new Scene(gameScreen.getFXML()));
        }catch (Exception ex){
            Logger.getLogger(AllInPoker.class.getName()).log(Level.SEVERE, null, ex);  
        }
    }


}
