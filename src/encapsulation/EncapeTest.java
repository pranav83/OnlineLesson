package encapsulation;

public class EncapeTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setName("John");
        p1.setAge(36 );
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}
