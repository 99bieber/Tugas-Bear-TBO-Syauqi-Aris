/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.besar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SYAUQI
 */

//inheritance
public class kategoriController implements Initializable {

    /**
     * Initializes the controller class.
     */
    //overriding
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        list = FXCollections.observableArrayList("Baju","Celana","Sepatu","Topi","Kemeja");
        kategori_pilih.setItems(list);
    }    
    //enkapsulapsi
   void ambilNilai(){
   kategori_pilihan = kategori_pilih.getSelectionModel().getSelectedItem();
   }

   @FXML
   private ChoiceBox<String> kategori_pilih;
   ObservableList<String> list;
   @FXML
   private Label erno;
   @FXML
   private Button oke;
   String kategori_pilihan;
   @FXML
   private void kategoriAction (ActionEvent event) throws IOException {
       ambilNilai();
       if(kategori_pilihan==null){
            erno.setVisible(true);
            erno.setText("Anda Belum Memasukkan Pilihan");
        }
       else{
           Node source1 = (Node)event.getSource();
           Stage stage1 = (Stage)source1.getScene().getWindow();
           stage1.close();
           try{
           FXMLLoader loader = new FXMLLoader();    
           Parent root = loader.load(getClass().getResource("Beli.fxml").openStream());
           beliController out = new beliController();
           out = loader.getController();
           out.setNilai(kategori_pilihan);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(new Scene(root));
           stage.show();

           }
           catch(Exception e){
               System.out.println("Eror");
           }
       }
   }
}

