package nested;

public class NestedShadowDemo {
    public static void main(String[] args) {
        NestedShadow nestedShadow = new NestedShadow();
        NestedShadow.InnerClass innerClass = nestedShadow.new InnerClass(3);
    }
}
