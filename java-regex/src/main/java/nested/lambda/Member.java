package nested.lambda;

public class Member {
    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private Sex gender;
    private String emailAddress;
    private int age;

    public int getAge() {
        return age;
    }

    public Member(String name, Sex gender, String emailAddress, int age) {
        this.name = name;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Sex getGender() {
        return gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    @Override
    public String toString(){
        return String.format("Name = %s,Age = %d",name,age);
    }
}
