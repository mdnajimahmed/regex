public class House {
    private class InHouse{
         public InHouse(){

        }
    }
    private int a;

    public House(int a) {
        this.a = a;
        System.out.println(a + " " + this.a);
    }
    public int getMath(){
        return this.a ;
    }

    public static void main(String... args) {
        House h = new House(1);
        increase(h);
        System.out.println(h.a);
        System.out.println(h);
        House h2;
//        System.out.println(h2);
    }

    private static void increase(House house) {
        System.out.println(house);
        house.a++;
    }
}
