package oppsbinoy1;

public class PolyRunTest {
    public static void main(String[] args) {
        PolyRunGeomatry shape2 = new PolyRunCircle(5);
        PolyRunGeomatry shape3 = new PolyRunRectangle(12,6);
        PolyRunGeomatry shape4 = new PolyRunSquare(4);
        PolyRunGeomatry shape5 = new PolyRunTriangle(12, 7);

        System.out.println( shape2.area());
        System.out.println( shape3.area());
        System.out.println( shape4.area());
        System.out.println( shape5.area());
    PolyRunGeomatry [] s = new PolyRunGeomatry[4];

        s [0] = new PolyRunCircle(5);
        s [1] = new PolyRunRectangle(12,6);
        s [2] = new PolyRunSquare(4);
        s [3] = new PolyRunTriangle(12, 7);


        for (int i = 0; i <4 ; i++) { System.out.println(s[i].area());}
    }
}
