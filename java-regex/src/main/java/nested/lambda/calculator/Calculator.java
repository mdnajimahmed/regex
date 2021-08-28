package nested.lambda.calculator;


public class Calculator {
    Button[] buttons = new Button[10];

    public void addButton(int i, Button button) {
        this.buttons[i] = button;
    }

    public Button getButton(int pos) {
        return buttons[pos];
    }
}
