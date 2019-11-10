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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author SYAUQI
 */
public class bayarController implements Initializable {

    /**
     * Initializes the controller class.
     * @param -
     */
    //overriding
    public void setCoba1(String aha, int total, int moui1) {
        
        brg.setText(aha);
        hrg.setText(String.valueOf(total));
        qty.setText(String.valueOf(moui1));
        harga = hrg.getText();
        System.out.println(harga);
        barang = aha; 
        qty1 = qty.getText();
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    @FXML
    private TextField brg,hrg,qty;
    @FXML
    private Button woke;  
    
    String barang,qty1,harga;
    @FXML
   private void bayarinAction (ActionEvent event) throws IOException {
           Node source1 = (Node)event.getSource();
           Stage stage1 = (Stage)source1.getScene().getWindow();
           stage1.close();
       try{ 
           
           FXMLLoader loader = new FXMLLoader();    
           Parent root = loader.load(getClass().getResource("pembayar.fxml").openStream());
           pembayarController out = new pembayarController();
           out = loader.getController();
           out.setCoba2(harga,barang,qty1);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(new Scene(root));
           stage.show();


           }
           catch(Exception e){
               System.out.println("Eror");
           }
}

}
