package nested.local;

public class EffFinalOrCapturedVariable {
    int effFinal = 1;

    public void outerTest() {
        int localVariable = 100;
        class LocalClass {
            void innerTest() {
                System.out.println(effFinal);
                effFinal++;
                System.out.println("local variable = " + localVariable);
//                localVariable++;// you can not do that.
            }
        }
        effFinal++;
//        localVariable++; // can not do that either;
        LocalClass localClass = new LocalClass();
        localClass.innerTest();
    }

    public static void main(String[] args) {
        EffFinalOrCapturedVariable e = new EffFinalOrCapturedVariable();
        e.outerTest();
        System.out.println(e.effFinal);
    }
}
