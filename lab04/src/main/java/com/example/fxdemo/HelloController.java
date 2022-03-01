package com.example.fxdemo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    public TextField uname;
    public TextField fullname;
    public TextField email1;
    public TextField pnum;
    @FXML
    private Text dob;

    @FXML
    private Text email;

    @FXML
    private Text fname;

    @FXML
    private Text password;

    @FXML
    private Text phone;

    @FXML
    private Button registerButton;

    @FXML
    void registerAction(ActionEvent event) {
        System.out.println(uname.getText());
        System.out.println(fullname.getText());
        System.out.println(email1.getText());
        System.out.println(pnum.getText());
    }
}