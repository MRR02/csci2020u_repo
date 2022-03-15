module com.example.lab_06 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab_06 to javafx.fxml;
    exports com.example.lab_06;
}