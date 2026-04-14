package dev.skystone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField heightField;

    @FXML
    private TextField radiusField;

    @FXML
    private TextField surfaceField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
        this.startCalc();
    }

    void startCalc(){
        double radius = Double.parseDouble(radiusField.getText());
        double height = Double.parseDouble(heightField.getText());
        double surface = Cylinder.calcSurface(radius, height);
        surfaceField.setText(String.valueOf(surface));
    }

}
