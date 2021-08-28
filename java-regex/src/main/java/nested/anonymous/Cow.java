package nested.anonymous;

public abstract class Cow {
    private String color;

    public Cow(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract String getName();
}
