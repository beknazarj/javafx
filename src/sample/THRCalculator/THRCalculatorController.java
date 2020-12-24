package sample.THRCalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.math.BigDecimal;
import java.math.MathContext;

public class THRCalculatorController {

    @FXML
    private TextField yearTextField;

    @FXML
    private TextField targetHeartRate1TextField;

    @FXML
    private TextField targetHeartRate2TextField;

    @FXML
    private Button calculateButton;

    @FXML
    void calculateButtonPressed(ActionEvent event) {
        try{
            BigDecimal age = new BigDecimal(yearTextField.getText());
            if(age.compareTo(new BigDecimal(0))<=0){
                throw  new NumberFormatException();
            }
            BigDecimal maximumHeartRate = new BigDecimal(200).subtract(age);
            BigDecimal heartRateLower = maximumHeartRate.multiply(new BigDecimal(0.50)).round(new MathContext(4));
            BigDecimal heartRateUpper = maximumHeartRate.multiply(new BigDecimal(0.85)).round(new MathContext(4));

            String ans1 = String.format("%s bpm",heartRateLower.toString());
            String ans2 = String.format("%s bpm",heartRateUpper.toString());
            targetHeartRate1TextField.setText(ans1);
            targetHeartRate2TextField.setText(ans2);

        }
        catch (NumberFormatException ex){
            yearTextField.setText("Enter your Age");
            yearTextField.selectAll();
            yearTextField.requestFocus();
        }

    }

}
