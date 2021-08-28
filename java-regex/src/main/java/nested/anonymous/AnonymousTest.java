package nested.anonymous;

public class AnonymousTest {
    public static void main(String[] args) {
        Cow cow = new Cow("Red"){
            @Override
            public String getName(){
                return this.getColor() + " Cow !!!";
            }
        };
        System.out.println(cow.getName());
    }
}
