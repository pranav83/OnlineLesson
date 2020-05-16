package returning_value;

public class Test {
    public static void main(String[] args) {
        ReturningValueDemo ob1 = new ReturningValueDemo();
        //int result = ob1.square(5);//
        //System.out.println("square of 5: "+result);//
        System.out.println("square of 5: "+ob1.square(5));

        ReturningValueDemo ob2 = new ReturningValueDemo();
        System.out.println("square of 5: "+ob2.square(6));
    }
}
