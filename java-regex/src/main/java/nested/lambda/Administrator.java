package nested.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Administrator {
    interface MemberFilter {
        boolean test(Member member);
    }

    List<Member> members;

    public Administrator(List<Member> members) {
        this.members = members;
    }

    private void filterAndShow(MemberFilter filter) {
        this.members.stream().filter(m -> filter.test(m)).forEach(System.out::println);
    }

    private void builtInFilterAndShow(Predicate<Member> filter) {
        this.members.stream().filter(m -> filter.test(m)).forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int age = (int) (Math.random() * 20);
            members.add(
                    new Member(String.format("Najim-%d", i + 1), Member.Sex.values()[i % 2],
                            String.format("najim-%d@gmail.com", i + 1), age));
        }
        Administrator administrator = new Administrator(members);
        administrator.filterAndShow(m -> m.getAge() > 10);
        System.out.println("****************");
        administrator.builtInFilterAndShow(m -> m.getAge() > 10);
    }


}
