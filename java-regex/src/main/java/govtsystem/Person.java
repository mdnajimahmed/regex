package govtsystem;

public class Person {

    private String Name;
    private Integer Age;

    public int getAge(){
        return this.Age;
    }

    public String  getName(){
        return this.Name;
    }

    protected void setAge(Integer age){
        if(age<0){
            throw new RuntimeException("Age can not be negative");
        }
        this.Age = age;
    }
    public void setName(String name){
        if(name.length()>10){
            throw new RuntimeException("Name must not have more than 10 characters");
        }
        this.Name = name;
    }

    public void randomFunction(){
        System.out.println("I am just a function");
    }
}
