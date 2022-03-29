module com.example.lab_08 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab_08 to javafx.fxml;
    exports com.example.lab_08;
}