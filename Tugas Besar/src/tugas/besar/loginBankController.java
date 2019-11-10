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
 *
 * @author SYAUQI
 */
//inheritance
public class loginBankController extends data implements Initializable {

    /**
     * Initializes the controller class.
     */
    public void setCoba3(String bayar, String br, String vc, String qt2) {
        by = bayar;
        brg = br;
        virtual = vc;
        qt3 = qt2;
        tabung = 100000;
    }
    //overriding
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    //enkapsulapsi
    @FXML
    private Button lg;
    @FXML
    private Label kk;
    @FXML
    private PasswordField pw;
    @FXML
    private TextField us;
    String by, brg, virtual, qt3, userr,pass;
    int tabung;
    
    @FXML 
    private void loginBankAction (ActionEvent event) throws IOException {
        //overloading
        login1();
        //asesor
        if(login1()=="benar"){
           kk.setVisible(true);
           kk.setText("Login Sukses");
           kk.setStyle("-fx-text-fill: green;");
           Node source1 = (Node)event.getSource();
           Stage stage1 = (Stage)source1.getScene().getWindow();
           stage1.close();
       try{ 
           
           FXMLLoader loader = new FXMLLoader();    
           Parent root = loader.load(getClass().getResource("Bank.fxml").openStream());
           bankController out = new bankController();
           out = loader.getController();
           out.setCoba4(by,brg,virtual,qt3,tabung);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(new Scene(root));
           stage.show();


           }
           catch(Exception e){
               System.out.println("Eror");
               e.printStackTrace();
           }
        } 
        else if(login1()=="salahusername"){
           kk.setVisible(true);
           kk.setText("Username Salah");
           kk.setStyle("-fx-text-fill: red;");  
        }
        else if(login1()=="salahpassword"){
           kk.setVisible(true);
           kk.setText("Password Salah");
           kk.setStyle("-fx-text-fill: red;"); 
        }
        else{
           kk.setVisible(true);
           kk.setText("Login Gagal");
           kk.setStyle("-fx-text-fill: red;");
            
        }
    }
    private String login1(){
        userr = us.getText();
        pass = pw.getText();
        if(userr.equals("aku") && pass.equals("aku")){
            return "benar";
        }
        else if(userr!="aku" && pass.equals("aku")){
            return "salahusername";
        }
        else if(userr.equals("aku") && !pass.equals("aku")){
            return "salahpassword";
        }
        else {
            return "salah";
        }
    }
}
