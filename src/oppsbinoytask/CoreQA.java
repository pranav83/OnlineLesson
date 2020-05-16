package oppsbinoytask;

public class CoreQA {
    String studentname;
    String studentLevel;
    private int mobilenumber;
    private int studentage;

    public int getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(int mobileno) {
        this.mobilenumber = mobileno;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    CoreQA(){
        this.studentname = "jayanta";
        this.studentLevel = "A";

    }
    void displayinformation(){
        System.out.println("StudentName is: "+studentname);
        System.out.println("StudentLevel is: "+studentLevel);
        System.out.println("MobileNumber is: "+getMobilenumber());
        System.out.println("StudentAge is: "+getStudentage());
    }

}
