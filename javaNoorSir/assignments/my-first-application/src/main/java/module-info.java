module com.example.myfirstapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfirstapplication to javafx.fxml;
    exports com.example.myfirstapplication;
}