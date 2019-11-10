/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.besar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SYAUQI
 */

//inheritance
public class loginController extends data implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    //overriding
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    //enkapsulapsi
    @FXML
    private Button loginbtn;
    @FXML
    private Label ss,gg;

    @FXML 
    private void loginAction (ActionEvent event) throws IOException {
        //overloading
        data d = new data() {};
        user = d.user();
        //asesor
        if(login()=="benar"){
           ss.setVisible(true);
           ss.setText("Login Sukses");
           ss.setStyle("-fx-text-fill: green;");
           Node source1 = (Node)event.getSource();
           Stage stage1 = (Stage)source1.getScene().getWindow();
           stage1.close();
           try{
               
           Parent root = FXMLLoader.load(getClass().getResource("Kategori.fxml"));
        
           Stage s = new Stage();
            Scene scene = new Scene(root, 600, 400);
            
            s.setTitle("FXML Welcome");
            s.setScene(scene);
            s.show();
           }
           catch(Exception e){
               System.out.println("Asu");
           }
        } 
        else if(login()=="salahusername"){
           ss.setVisible(true);
           ss.setText("Username Salah");
           ss.setStyle("-fx-text-fill: red;");  
        }
        else if(login()=="salahpassword"){
           ss.setVisible(true);
           ss.setText("Password Salah");
           ss.setStyle("-fx-text-fill: red;"); 
        }
        else{
           ss.setVisible(true);
           ss.setText("Login Gagal");
           ss.setStyle("-fx-text-fill: red;");
            
        }
    }
    private String login(){
        setdata();
        if(user.equals("aku") && pw.equals("aku")){
            return "benar";
        }
        else if(user!="aku" && pw.equals("aku")){
            return "salahusername";
        }
        else if(user.equals("aku") && pw!="aku"){
            return "salahpassword";
        }
        else {
            return "salah";
        }
    }
}
