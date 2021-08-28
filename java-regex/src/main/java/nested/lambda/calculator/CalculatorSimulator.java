package nested.lambda.calculator;

public class CalculatorSimulator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addButton(0,new Button(0));
        calculator.getButton(0).addEventHandler(e -> System.out.println("Clicked " + e.getButton().getDigit() + " via " + e.getEventType()));
        calculator.getButton(0).press();
        calculator.getButton(0).touch();
    }
}
