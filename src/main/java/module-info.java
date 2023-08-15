module com.example.samost1508 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.samost1508 to javafx.fxml;
    exports com.example.samost1508;
}