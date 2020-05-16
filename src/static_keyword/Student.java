package static_keyword;

public class Student {

    String name;
    int Id;
   static String universityName = "CMU";

   Student(String n,int i){
       name = n;
       Id = i;
   }

   void displayinformation(){
       System.out.println("Name: "+name);
       System.out.println("ID: "+Id);
       System.out.println("University Name: "+universityName);
       System.out.println();
   }

}
