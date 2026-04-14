package dev.skystone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

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
        this.testInput();
        double radius = Double.parseDouble(radiusField.getText());
        double height = Double.parseDouble(heightField.getText());
        double surface = Cylinder.calcSurface(radius, height);
        surfaceField.setText(String.valueOf(surface));
    }

    void testInput(){
        String radiusStr = radiusField.getText();
        String heightStr = heightField.getText();
        if(radiusStr.isEmpty() || heightStr.isEmpty()) {
            String msg = "Hiba! Nem lehet üres a beviteli mező!";
            this.showError(msg);
            throw new IllegalArgumentException(msg);
        };
        if(!radiusStr.matches("[0-9]+") || !heightStr.matches("[0-9]+")){
            String msg = "Hiba! Csak szám adható meg!";
            this.showError(msg);
            throw new IllegalArgumentException(msg);
        }
    }

    void showError(String errorMsg){
        Alert alert = new Alert(AlertType.ERROR);
        alert.setContentText(errorMsg);
        alert.setTitle("Hiba!");
        alert.setHeaderText("Nem megfelelő bemenet!");
        alert.initOwner(App._stage);
        alert.showAndWait();
    }
}
