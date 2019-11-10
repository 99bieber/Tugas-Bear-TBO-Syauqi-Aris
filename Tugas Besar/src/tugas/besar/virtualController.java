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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author SYAUQI
 */
public class virtualController  implements Initializable {

    void setCoba5(String bayar, String brg1, String virtual1, String qt4, int tabung1) {
        bayar1 = bayar;
        brg2 = brg1;
        virtual2 = virtual1;
        qt5 = qt4;
        tabung2 = tabung1;
        test2.setVisible(true);
        test2.setText("Tabungan = Rp."+tabung2);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    @FXML
    private TextField virtual12;
    @FXML
    private Button virtual_cek;
    @FXML
    private Label war,test2;
    
    String bayar1, brg2, virtual2, qt5, virtual_cheked;
    int tabung2;
    
    
    @FXML
    private void virtualAction (ActionEvent event) throws IOException {
        virtual_cheked = virtual12.getText();
        if(virtual2.equals(virtual_cheked)){
            Node source1 = (Node)event.getSource();
           Stage stage1 = (Stage)source1.getScene().getWindow();
           stage1.close();
       try{ 
           
           FXMLLoader loader = new FXMLLoader();    
           Parent root = loader.load(getClass().getResource("Virtualview.fxml").openStream());
           bayarvirtualController out = new bayarvirtualController();
           out = loader.getController();
           out.setCoba5(bayar1, brg2, virtual2, qt5, tabung2);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(new Scene(root));
           stage.show();


           }
           catch(Exception e){
               System.out.println("Eror");
               e.printStackTrace();
           }
        } else {
            war.setVisible(true);
            war.setText("Virtual Account Tidak Tersedia");
            war.setStyle("-fx-text-fill: red;"); 
        }
       
   }

}
