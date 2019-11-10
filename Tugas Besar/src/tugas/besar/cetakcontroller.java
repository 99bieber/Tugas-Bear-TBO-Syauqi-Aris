/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.besar;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author SYAUQI
 */

//inheritance
public class cetakcontroller extends datavirtual implements Initializable {

    /**
     * Initializes the controller class.
     */
    void setCoba6(String bayar2, String brg3, String virtual3, String qt6, int tabung3) {
        nama_barang.setText(brg3);
        qty.setText(qt6);
        harga_total.setText(bayar2);
        bayar3 = bayar2;
        tabung = tabung3;
        sisatabung();
    }
    
    //enkapsulapsi
    @FXML
    private TextField virtual_code,nama_barang,qty,harga_total,sisa;
    String virtuall, namaa,qttt, httt,bayar3;
    int tabung, bayar4,sisaaa;
    //overriding
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Exception Handling
    } 
    
    public void sisatabung(){
        bayar4 = Integer.parseInt(bayar3);
        if(tabung >= bayar4){
            sisaaa=  tabung - bayar4;
            sisa.setText(String.valueOf(sisaaa));
            virtual_code.setText("Berhasil");
        } else{
            virtual_code.setText("Gagal");
            sisa.setText(String.valueOf(tabung));
        }
    }


}
