package nested;

public class NestedStatic {
    private int a;
    private static int b;

    public NestedStatic(int a) {
        this.a = a;
    }

    static class YumYum {
//        private int a;
//        private static int notPossible; can not declare static variable

        public YumYum(int a) {
//            this.a = a;
        }

        void showA() {
            // can not point to a, because static block can not refer to non static block
//            System.out.println("Which a !!! " + a);
            // but it can point to b.
            System.out.println(b);
        }
    }
}
