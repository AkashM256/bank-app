module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;

    opens org.example to javafx.fxml;
    exports org.example;
}