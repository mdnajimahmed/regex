package nested.lambda.calculator;

public class Button {
    private int digit;
    private EventHandler eventHandler = (e)-> System.out.println(" I am default event handler");

    public int getDigit() {
        return digit;
    }

    public Button(int digit) {
        this.digit = digit;
    }

    public void press() {
        Event e = new Event(this, EventType.KEY);
        eventHandler.handleEvent(e);
    }

    public void touch() {
        Event e = new Event(this, EventType.TOUCH);
        eventHandler.handleEvent(e);
    }

    public void addEventHandler(EventHandler handler) {
        this.eventHandler = handler;
    }
}
