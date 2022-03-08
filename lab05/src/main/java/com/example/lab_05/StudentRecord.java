package com.example.lab_05;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class StudentRecord {
    private String id;
    private double assignments;
    private double midterm;
    private double fexam;
    private double fmark;
    private String grade;
    public StudentRecord(String id, double ass, double mid, double fexam){
        this.id = id;
        this.assignments = ass;
        this.midterm = mid;
        this.fexam = fexam;
        this.fmark = (.2*(ass) + .3*(mid) + .5*(fexam));
        if (fmark < 50) {
            this.grade = "F";
        } else if (fmark < 60) {
            this.grade = "D";
        } else if (fmark < 70) {
            this.grade = "C";
        } else if (fmark < 80) {
            this.grade = "B";
        } else if (fmark < 100){
            this.grade = "A";
        }
    }
    /*public String getid() {
        return id.get();
    }
    */
}
