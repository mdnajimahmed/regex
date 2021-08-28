package nested;

public class NestedRunner {
    public static void main(String[] args) {
        NestedInner nestedInner = new NestedInner(1);
        NestedInner.YumYum nestedYumYum = nestedInner.new YumYum(2);
        nestedYumYum.showA();
    }
}
