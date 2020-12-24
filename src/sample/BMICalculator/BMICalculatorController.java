package sample.BMICalculator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class BMICalculatorController {

    ObservableList<String> checkWeight = FXCollections.observableArrayList("WEIGHT IN KGS", "WEIGHT IN LBS");
    ObservableList<String> checkHeight = FXCollections.observableArrayList("HEIGHT IN INCHES", "HEIGHT IN METERS");



    // GUI controls defined in FXML and used by the controller's code
    @FXML
    private TextField weightTextField;

    @FXML
    private TextField heightTextField;

    @FXML
    private TextField bmiTextField;



    @FXML
    private ChoiceBox<String> weightStatusBox;

    @FXML
    private ChoiceBox<String> heightStatusBox;

    // calculates and displays the tip and total amounts
    @FXML
    private void calculateButtonPressed(ActionEvent event) {
        try {
            String result = "";
            double checkBmi = 0;
            String height = heightTextField.getText();
            String weight = weightTextField.getText();
            double checkHeight = Double.parseDouble(height);
            double checkWeight = Double.parseDouble(weight);

            if (weightStatusBox.getValue().equals("WEIGHT IN KGS") && heightStatusBox.getValue().equals("HEIGHT IN METERS")){

                checkBmi = checkWeight / Math.pow(checkHeight, 2);
                //result = "KGS";

            } else if (weightStatusBox.getValue().equals("WEIGHT IN LBS") && heightStatusBox.getValue().equals("HEIGHT IN INCHES")){

                checkBmi = 703 * ( checkWeight / Math.pow(checkHeight, 2));
                //result = "lbs";

            }else {
                result = "Please select proper metrics";
            }

            if (checkBmi < 18.5){
                result="Underweight";
            }else if (checkBmi >=18.5 && checkBmi<=24.9){
                result="Normal";
            }else if (checkBmi >=25 && checkBmi <=29.9){
                result = "Overweight";
            }else if (checkBmi > 30){
                result="Obese";
            }
            //bmiTextField.setText(result + " "+ (String.format("%.2d",checkBmi)));
            //bmiTextField.setText(String.valueOf(checkHeight + checkWeight));
            bmiTextField.setText(String.format("%s : %.2f",result, checkBmi));

        }
        catch (NumberFormatException e) {
            weightTextField.setText("Error");
            heightTextField.setText("Error");
            //weightTextField.selectAll();
            //weightTextField.requestFocus();

        }
    }

    // called by FXMLLoader to initialize the controller
    public void initialize() {
        // 0-4 rounds down, 5-9 rounds up
        //currency.setRoundingMode(RoundingMode.HALF_UP);

        weightStatusBox.setValue("WEIGHT IN KGS");
        weightStatusBox.setItems(checkWeight);

        heightStatusBox.setValue("HEIGHT IN METERS");
        heightStatusBox.setItems(checkHeight);



    }
}