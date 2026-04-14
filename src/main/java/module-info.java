module dev.skystone {
    requires javafx.controls;
    requires javafx.fxml;

    opens dev.skystone to javafx.fxml;
    exports dev.skystone;
}
