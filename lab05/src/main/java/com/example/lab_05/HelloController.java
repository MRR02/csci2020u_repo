package com.example.lab_05;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {


    @FXML
    TableView tableview;

    public void initialize(URL url, ResourceBundle rb) {
        TableColumn SID = new TableColumn("SID");
        TableColumn assignments = new TableColumn("Assignments");
        TableColumn mid = new TableColumn("Midterm");
        TableColumn finale = new TableColumn("Final Exam");
        TableColumn finalm = new TableColumn("Final Mark");
        TableColumn grade = new TableColumn("Letter Grade");

        tableview.getColumns().addAll(SID, assignments, mid, finale, finalm, grade);

        final ObservableList<StudentRecord> marks = FXCollections.observableArrayList(
                new StudentRecord("100100100", 75.0f, 68.0f, 54.25f)
        );

        SID.setCellValueFactory(new PropertyValueFactory<StudentRecord,String>("SID"));
        assignments.setCellValueFactory(new PropertyValueFactory<StudentRecord, Double>("assignments"));
        mid.setCellValueFactory(new PropertyValueFactory<StudentRecord, Double>("midterm"));
        finale.setCellValueFactory(new PropertyValueFactory<StudentRecord, Double>("final exam"));
        finalm.setCellValueFactory(new PropertyValueFactory<StudentRecord, Double>("final mark"));
        grade.setCellValueFactory(new PropertyValueFactory<StudentRecord, String>("grade"));

        tableview.setItems(marks);
    }



}