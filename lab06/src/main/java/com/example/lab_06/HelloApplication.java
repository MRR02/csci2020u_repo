package com.example.lab_06;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.fxml.Initializable;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        /*
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1003, 560);
        stage.setTitle("Lab 06");
        stage.setScene(scene);
        stage.show();
        */



        stage.setTitle("Bar Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc =
                new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Prices by Year");
        xAxis.setLabel("Category");
        yAxis.setLabel("Price");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Average House Price");
        series1.getData().add(new XYChart.Data("Year 1", 247381.0));
        series1.getData().add(new XYChart.Data("Year 2", 264171.4));
        series1.getData().add(new XYChart.Data("Year 3", 287715.3));
        series1.getData().add(new XYChart.Data("Year 4", 294736.1));
        series1.getData().add(new XYChart.Data("Year 5", 308431.4));
        series1.getData().add(new XYChart.Data("Year 6", 322635.9));
        series1.getData().add(new XYChart.Data("Year 7", 340253.0));
        series1.getData().add(new XYChart.Data("Year 8", 363153.7));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Average Commercial Price");
        series2.getData().add(new XYChart.Data("Year 1", 1121585.3));
        series2.getData().add(new XYChart.Data("Year 2", 1219479.5));
        series2.getData().add(new XYChart.Data("Year 3", 1246354.2));
        series2.getData().add(new XYChart.Data("Year 4", 1295364.8));
        series2.getData().add(new XYChart.Data("Year 5", 1335932.6));
        series2.getData().add(new XYChart.Data("Year 6", 1472362.0));
        series2.getData().add(new XYChart.Data("Year 7", 1583521.9));
        series2.getData().add(new XYChart.Data("Year 8", 1613246.3));



        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("18-25", 648),
                        new PieChart.Data("26-35", 1021),
                        new PieChart.Data("36-45", 2453),
                        new PieChart.Data("46-55", 3173),
                        new PieChart.Data("56-65", 1868),
                        new PieChart.Data("65+", 2247));
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Purchase by age group");

        //((Group) scene.getRoot()).getChildren().add(chart);

        Scene scene  = new Scene(bc,800,600);
        bc.getData().addAll(series1, series2);
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}