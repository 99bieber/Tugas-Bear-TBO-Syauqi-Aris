/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.besar;

import static com.sun.corba.se.impl.orbutil.CorbaResourceUtil.getText;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author SYAUQI
 */
//inheritance
public class beliController extends kategoriController implements Initializable {

    /**
     * Initializes the controller class.
     */
    //overriding
    public int harga,total,moui1;
    String coba1;
    public String moui,coba12;
    public void setNilai(String kategori_pilihan){
        moui = kategori_pilihan;
        brg_beli.setText(kategori_pilihan);
        if( "Baju".equals(moui)){
            harga = 20000;
            hrg_beli.setText(String.valueOf(20000));
            harga = Integer.parseInt(hrg_beli.getText());
            System.out.println(harga);
        }
        else if("Celana".equals(moui)){
            hrg_beli.setText(String.valueOf(50000));
            harga = Integer.parseInt(hrg_beli.getText());
            System.out.println(harga);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    //enkapsulapsi
   @FXML
   private TextField brg_beli, jml_beli, hrg_beli;
   @FXML
   private Label announ;
   
   String aha;
   
   @FXML
   private void beliAction (ActionEvent event) throws IOException {
       run();
       Node source1 = (Node)event.getSource();
           Stage stage1 = (Stage)source1.getScene().getWindow();
           stage1.close();
       try{ 
           FXMLLoader loader = new FXMLLoader();    
           Parent root = loader.load(getClass().getResource("Bayar.fxml").openStream());
           bayarController out = new bayarController();
           out = loader.getController();
           out.setCoba1(aha,total,moui1);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(new Scene(root));
           stage.show();


           }
           catch(Exception e){
               System.out.println("Eror");
           }
           
       
   }
   
 
    public void run(){
       moui1 = Integer.parseInt(jml_beli.getText());
       aha = brg_beli.getText();
       total = moui1 * harga;
    }

    void myFunction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void myFunction(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setNilai() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getText(TextField jml_beli) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


