package inheretance;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Jatin";
        t1.age = 35;
        t1.qualification = "MSC in CSE";
        t1.displayInformation2();

        System.out.println();

        Teacher t2 = new Teacher();
        t2.name = "Pallav";
        t2.age = 30;
        t2.qualification = "BSC in CSE";
        t2.displayInformation2();
    }
}
