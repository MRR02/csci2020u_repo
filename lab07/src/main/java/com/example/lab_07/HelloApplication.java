package com.example.lab_07;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Scene scene = new Scene(new Group());
        stage.setTitle("Lab07");
        stage.setWidth(500);
        stage.setHeight(500);

        String line = "";
        String splitBy = ",";

        int flashCount = 0;
        int thunderCount = 0;
        int marineCount = 0;
        int tornadoCount = 0;

        try
        {
        //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Reza\\IdeaProjects\\lab_07\\src\\main\\java\\com\\example\\lab_07\\weatherwarnings-2015.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] weather = line.split(splitBy);    // use comma as separator
                switch(weather[5]){
                    case "FLASH FLOOD":
                        flashCount++;
                        break;
                    case "SEVERE THUNDERSTORM":
                        thunderCount++;
                        break;
                    case "SPECIAL MARINE":
                        marineCount++;
                        break;
                    case "TORNADO":
                        tornadoCount++;
                        break;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("FLASH FLOOD", flashCount),
                        new PieChart.Data("SEVERE THUNDERSTORM", thunderCount),
                        new PieChart.Data("SPECIAL MARINE", marineCount),
                        new PieChart.Data("TORNADO", tornadoCount));
        final PieChart chart = new PieChart(pieChartData);


        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}