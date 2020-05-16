package oppsbinoytask;

public class CoreQATest {
    public static void main(String[] args) {
        AlphaAndBetaBatch ob1 = new AlphaAndBetaBatch();
        System.out.println("Country is: "+ob1);
        ob1.setMobilenumber(12345678);
        ob1.setStudentage(29);
        ob1.displayinformation();
    }
}
