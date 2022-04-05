package com.example.lab09;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloApplication extends Application {

    public InputStream downloadStockPrices(String stockName){
        try{
        URL url = new URL("https://query1.finance.yahoo.com/v7/finance/download/"+stockName+"?period1=1262322000&period2=1451538000&interval=1mo&events=history&includeAdjustedClose=true");
        URLConnection conn = url.openConnection();
        conn.setDoOutput(false);
        conn.setDoInput(true);
        InputStream is = conn.getInputStream();
        return is;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void start(Stage stage) throws IOException {

        //first stock
        InputStream i = downloadStockPrices("GOOG");

        Scanner s = new Scanner(i).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";
        System.out.println(result);

        try {
            BufferedWriter writer = new BufferedWriter (new FileWriter("data.csv"));    //temp is the new airline_safety csv file

                String newFileLine = result;
                writer.write (newFileLine);

            writer.close ();
        } catch (IOException excep) {
            System.err.println ("Exception " + excep);
        }

        //second stock
        InputStream i2 = downloadStockPrices("AAPL");

        Scanner s2 = new Scanner(i2).useDelimiter("\\A");
        String result2 = s2.hasNext() ? s2.next() : "";
        System.out.println(result2);

        try {
            BufferedWriter writer = new BufferedWriter (new FileWriter("data2.csv"));    //temp is the new airline_safety csv file

            String newFileLine = result2;
            writer.write (newFileLine);

            writer.close ();
        } catch (IOException excep) {
            System.err.println ("Exception " + excep);
        }

        stage.setTitle("Lab 09");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();

        final LineChart<String,Number> lineChart =
                new LineChart<String,Number>(xAxis,yAxis);



        XYChart.Series series1 = new XYChart.Series();
        series1.setName("GOOG");
        String line = "";
        String splitBy = ",";
        try
        {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("data.csv"));
            int k =0; //used to skip first line
            while ((line = br.readLine()) != null) {
                String[] lineEntry = line.split(splitBy);    // use comma as separator
                if(k == 0){
                    k++;
                    continue;
                }
                series1.getData().add(new XYChart.Data(lineEntry[0],Float.parseFloat(lineEntry[4])));


            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        XYChart.Series series2 = new XYChart.Series();
        series2.setName("AAPL");
        line = "";
        splitBy = ",";
        try
        {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("data2.csv"));
            int k =0; //used to skip first line
            while ((line = br.readLine()) != null) {
                String[] lineEntry = line.split(splitBy);    // use comma as separator
                if(k == 0){
                    k++;
                    continue;
                }
                series2.getData().add(new XYChart.Data(lineEntry[0],Float.parseFloat(lineEntry[4])));


            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().addAll(series1, series2);

        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}

