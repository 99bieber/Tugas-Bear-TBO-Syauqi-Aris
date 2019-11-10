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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author SYAUQI
 */
public class bayarvirtualController  implements Initializable {

    void setCoba5(String bayar1, String brg2, String virtual2, String qt5, int tabung2) {
        vir.setText(virtual2);
        brgg.setText(brg2);
        qtyy.setText(qt5);
        htt.setText(bayar1);
        bayar2 = bayar1;
        brg3 = brg2;
        virtual3 = virtual2;
        qt6 = qt5;
        tabung3 = tabung2;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
    @FXML
    private TextField vir, brgg, qtyy, htt;
    String bayar2, brg3, virtual3, qt6;
    int tabung3;
    
    @FXML
    private void bayarvirtualAction (ActionEvent event) throws IOException {
         Node source1 = (Node)event.getSource();
           Stage stage1 = (Stage)source1.getScene().getWindow();
           stage1.close();
       try{ 
           
           FXMLLoader loader = new FXMLLoader();    
           Parent root = loader.load(getClass().getResource("berhasilgagal.fxml").openStream());
           cetakcontroller out = new cetakcontroller();
           out = loader.getController();
           out.setCoba6(bayar2, brg3, virtual3, qt6, tabung3);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(new Scene(root));
           stage.show();


           }
           catch(Exception e){
               System.out.println("Eror");
               e.printStackTrace();
           }
       
    }
}
