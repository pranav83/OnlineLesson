package OppsBinoy;

public class InherritanceDemop {
    String firstname;
    String lastname;
    String email;
    private int age;

    public int getAge(int age) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void displayinformation(){
        System.out.println("first name is " + firstname);
        System.out.println("lastname name is " + lastname);
        System.out.println("email is " + email);
        System.out.println("age is "+getAge(33));
    }
}

