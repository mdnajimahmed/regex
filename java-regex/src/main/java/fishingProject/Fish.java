package fishingProject;

import govtsystem.Person;

public class Fish extends Person {
    void test() {
        System.out.println(super.getName() + " " + super.getAge());
    }

    @Override
    final public void randomFunction() {
        System.out.println("I am just a function");
    }
}
