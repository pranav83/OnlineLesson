package overloading_constractor;

public class OverloadingConstractorTest {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Dave","male");
        teacher2.displayinformation();
        Teacher teacher3 = new Teacher("Sraboni","Femail",123456788);
        teacher3.displayinformation();

    }
}
