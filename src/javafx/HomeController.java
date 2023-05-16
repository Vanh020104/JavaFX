package javafx;


import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class HomeController {

    public TextField txtName;
    public TextField txtEmail;
    public TextField txtPhone;
    public Text txtOut;
    public Text txtOut2;

    public ArrayList<String> emailList = new ArrayList<>();

    public  ArrayList<String> phoneList = new ArrayList<>();


    public void submit(ActionEvent actionEvent) {
        String name = txtName.getText();
        String email = txtEmail.getText();
        String phone = txtPhone.getText();
//Error email
        if (emailList.contains(email)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Email nay da ton tai!!!");
            alert.show();
            return;
        }
        emailList.add(email);


//Error phone
        if (phoneList.contains(phone)){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Telephone nay da ton tai!!!");
            alert.show();
            return;
        }
        phoneList.add(phone);


        String sv = "\n" + name + '\n' + email + "\n" + phone;
        txtOut.setText(txtOut.getText() + sv);
        txtName.clear();
        txtEmail.clear();
        txtPhone.clear();
    }
}