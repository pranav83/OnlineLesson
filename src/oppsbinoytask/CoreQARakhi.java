package oppsbinoytask;

public class CoreQARakhi {
    String studentName;
    String studentLevel;
    int mobileNo;
    private int studentAge;

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    void display(){
        System.out.println("Name of the Student is: "+studentName);
        System.out.println("Level of the Student is: "+studentLevel);
        System.out.println("Student's mobile number is: "+mobileNo);
        System.out.println("Age of the Student is: "+getStudentAge());
    }

}
