package OppsBinoy;

public class InnherritanceUKForm extends InherritanceDemop {
    int mobilenumber;

    static String country = "United Kingdom";  // its a good example of static variable

    void displayUKformInformation (){
        displayinformation();
        System.out.println(" Mobile number is : "+ mobilenumber);
        System.out.println( country);
    }
}
