package ooponline;

public class Test {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Jay Nath","male",1234566789);//object created
        //teacher1.setInformation("Jay Nath","male",1234566789);//
        teacher1.displayinformation();

        Teacher teacher2 = new Teacher("Jatindra Roy","male",126745789);//object created
        //teacher2.setInformation("Jatindra Roy","male",126745789);//
        teacher2.displayinformation();

        Teacher teacher3 = new Teacher();
        teacher3.displayinformation();

    }
}
