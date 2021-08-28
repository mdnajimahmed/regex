package nested.lambda.calculator;

class Event {
    private EventType eventType;

    public EventType getEventType() {
        return eventType;
    }

    public Button getButton() {
        return button;
    }

    private Button button;

    public Event(Button button, EventType eventType) {
        this.button = button;
        this.eventType = eventType;
    }

    public void onClick(EventHandler e) {
        e.handleEvent(this);
//            S
    }
}
