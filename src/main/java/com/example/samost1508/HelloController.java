package com.example.samost1508;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class HelloController {
    @FXML
    TextField firstSide;
    @FXML
    TextField secondSide;
    @FXML
    TextArea result;
    @FXML
    Button btnCalc;

    SimpleIntegerProperty fir = new SimpleIntegerProperty();
    SimpleIntegerProperty sec = new SimpleIntegerProperty();

    public void initialize() {
        firstSide.textProperty().bindBidirectional(fir, new DecimalFormat());
        secondSide.textProperty().bindBidirectional(sec, new DecimalFormat());
        //if (!(s < 0)) {
        fir.addListener((observableValue, number, t1) -> result.setText(String.valueOf(fir.get() * sec.get())));

        sec.addListener((observableValue, number, t1) -> result.setText(String.valueOf(fir.get() * sec.get())));

        btnCalc.setOnAction(actionEvent -> result.setText(String.valueOf(fir.get() * sec.get())));
        // } else {
        //    System.out.println("Отрицательные числа");
        //  }

    }
}