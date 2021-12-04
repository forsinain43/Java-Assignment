module com.example.gooey {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.gooey to javafx.fxml;
    exports com.example.gooey;
}