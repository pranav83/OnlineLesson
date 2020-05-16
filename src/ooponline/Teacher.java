package ooponline;

public class Teacher {
    String name,gender;
    int mobilenumber;

    /*void setInformation(String n,String m,int ph){
        name = n;
        gender = m;
        mobilenumber = ph;

    }*/

    Teacher(){
        System.out.println("no value");
    }
    Teacher(String n,String m,int ph){
        name = n;
        gender = m;
        mobilenumber = ph;

    }

    void displayinformation(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Mobile Number: "+mobilenumber);
        System.out.println("\n\n ");
    }
}
