module com.example.gooey {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.gooey to javafx.fxml;
    exports com.example.gooey;
}