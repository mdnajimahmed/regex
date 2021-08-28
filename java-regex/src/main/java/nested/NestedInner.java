package nested;

public class NestedInner {
    private int a;

    public NestedInner(int a) {
        this.a = a;
    }

    class YumYum {
//        private int a;
//        private static int notPossible; can not declare static variable

        public YumYum(int a) {
//            this.a = a;
        }

        void showA() {
            System.out.println("Which a !!! " + a);
        }
    }
}
