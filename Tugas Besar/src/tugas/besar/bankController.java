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
import javafx.stage.Stage;

/**
 *
 * @author SYAUQI
 */
public class bankController extends kategoriController implements Initializable {

    /**
     * Initializes the controller class.
     */
    //overriding
    void setCoba4(String by, String brg, String virtual, String qt3, int tabung) {
        bayar = by;
        brg1 = brg;
        virtual1 = virtual;
        qt4 = qt3;
        tabung1 = tabung;
        test1.setVisible(true);
        test1.setText("Tabungan = Rp."+tabung1);
        System.out.println(by);
        System.out.println(brg1);
        System.out.println(virtual1);
        System.out.println(qt4);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
   
    @FXML
    private Button govirtual;
    @FXML
    private Label test1;
    String bayar, brg1, virtual1, qt4;
    int tabung1;
    
    @FXML
    private void goAction (ActionEvent event) throws IOException {
        Node source1 = (Node)event.getSource();
           Stage stage1 = (Stage)source1.getScene().getWindow();
           stage1.close();
       try{ 
           
           FXMLLoader loader = new FXMLLoader();    
           Parent root = loader.load(getClass().getResource("Virtual.fxml").openStream());
           virtualController out = new virtualController();
           out = loader.getController();
           out.setCoba5(bayar, brg1, virtual1, qt4, tabung1);
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
