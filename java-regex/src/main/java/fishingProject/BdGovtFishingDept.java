package fishingProject;

import govtsystem.Person;

public class BdGovtFishingDept {
    static int a;
     int aa;
    public static void main(String[] args) {
        Fish f = new Fish();
        Person p = new Person();
        System.out.println(p);
//        p.setAge() - protected, wont compile
    }
    static void who(){
        System.out.println(a);
//        System.out.println(aa); - can not refer to instance method/member from static context
//        what();
    }
    void what(int b){
        System.out.println(a);
        System.out.println(aa);
    }
}
