package com.example.lab_08;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class StudentRecord {
    private SimpleStringProperty id;
    private SimpleDoubleProperty assignments;
    private SimpleDoubleProperty midterm;
    private SimpleDoubleProperty fexam;
    private SimpleDoubleProperty fmark;
    private SimpleStringProperty grade;

    public String getId() {
        return id.get();
    }

    public void setId(String id) {
        this.id = new SimpleStringProperty(id);
    }

    public double getAssignments() {
        return assignments.get();
    }

    public void setAssignments(double assignments) {
        this.assignments = new SimpleDoubleProperty(assignments);
    }

    public double getMidterm() {
        return midterm.get();
    }

    public void setMidterm(double midterm) {
        this.midterm = new SimpleDoubleProperty(midterm);
    }

    public double getFexam() {
        return fexam.get();
    }

    public void setFexam(double fexam) {
        this.fexam = new SimpleDoubleProperty(fexam);
    }

    public double getFmark() {
        return fmark.get();
    }

    public void setFmark(double fmark) {
        this.fmark = new SimpleDoubleProperty(fmark);
    }

    public String getGrade() {
        return grade.get();
    }

    public void setGrade(String grade) {
        this.grade = new SimpleStringProperty(grade);
    }

    public StudentRecord(String id, double ass, double mid, double fexam){
        this.id = new SimpleStringProperty(id);
        this.assignments = new SimpleDoubleProperty(ass);
        this.midterm = new SimpleDoubleProperty(mid);
        this.fexam = new SimpleDoubleProperty(fexam);
        this.fmark = new SimpleDoubleProperty(.2*(ass) + .3*(mid) + .5*(fexam));
        /*
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
        */ //issues getting data loaded into tableview, not sure why it wont load
    }
    /*public String getid() {
        return id.get();
    }
    */
}
