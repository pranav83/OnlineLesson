package oppsbinoytask;

public class CoreQATestRakhi {
    public static void main(String[] args) {
        AlphaBatchRakhi ab1 = new AlphaBatchRakhi();
        System.out.println("Alpha Batch:");
        ab1.studentName = "Tom";
        ab1.studentLevel = "A";
        ab1.mobileNo = 4789654;
        ab1.setStudentAge(30);
        ab1.display();

        System.out.println();

        BetaBatchRakhi bb2 = new BetaBatchRakhi();
        System.out.println("Beta Batch:");
        bb2.studentName = "Jerry";
        bb2.studentLevel = "B";
        bb2.mobileNo = 4123654;
        bb2.setStudentAge(31);
        bb2.display();
    }
}
