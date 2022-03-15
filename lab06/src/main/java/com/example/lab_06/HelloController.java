package com.example.lab_06;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.fxml.FXML;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private BarChart bchart;

    @FXML
    private PieChart pchart;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
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

        bchart.getData().addAll(series1,series2);
    }

}