/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.besar;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
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
public class pembayarController extends kategoriController implements Initializable {

    /**
     * Initializes the controller class.
     */
    //overriding
    public void setCoba2(String harga, String barang, String qty1) {
        bayar = harga;
        br = barang;
        qt2 = qty1;
        ht.setText(harga);
        qt.setText(qty1);
        random();
        vc_cd.setText(("70001 "+String.valueOf(b)));
        vc = String.valueOf(vc_cd.getText());
        System.out.println(vc);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    @FXML
    private TextField ht,qt,vc_cd;
    int b;
    String bayar,br,vc,qt2;
    
    @FXML
    private void pembayarAction (ActionEvent event) throws IOException {
    Node source1 = (Node)event.getSource();
           Stage stage1 = (Stage)source1.getScene().getWindow();
           stage1.close();
       try{ 
           
           FXMLLoader loader = new FXMLLoader();    
           Parent root = loader.load(getClass().getResource("loginBank.fxml").openStream());
           loginBankController out = new loginBankController();
           out = loader.getController();
           out.setCoba3(bayar,br,vc,qt2);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(new Scene(root));
           stage.show();


           }
           catch(Exception e){
               System.out.println("Eror");
           }
       
   }
   public void random(){
       Random rand = new Random();
       b = rand.nextInt(99999999);
       b += 10000000;
   }


}
