/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.besar;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author SYAUQI
 */

//abstrackclass
public abstract class data {
    @FXML
     TextField username;
    @FXML
     PasswordField password;
    String user,pw;
    //mutator
    public void setdata(){
        user = username.getText();
        pw = password.getText();
    }

    String user() {
        return "aku";
    }
}
