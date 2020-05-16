package static_variable;

public class Student {
   static int count = 0;

    Student(){
        count++;
    }

    void totalstudent(){
        System.out.println("Total student = "+count);
    }
}
