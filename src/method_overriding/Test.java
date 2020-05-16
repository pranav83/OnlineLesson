package method_overriding;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Jay";
        t1.age = 33;
        t1.qualification ="MSC in CSE";
        t1.displayInformation();

        System.out.println();

        Person p1 = new Person();
        p1.name = "Shen";
        p1.age = 35;
        p1.displayInformation();
    }
}
