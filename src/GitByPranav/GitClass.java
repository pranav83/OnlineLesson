package GitByPranav;

import java.util.HashSet;
import java.util.Iterator;

public class GitClass {
    public static void main(String[] args) {
        //HashSet treeset linkedHashset implement set interface
        HashSet hs = new HashSet<String>();
        hs.add("usa");
        hs.add("uk");
        hs.add("India");
        hs.add("India");
        hs.remove("India");
        hs.add("Pranav");
        hs.add("Neelraj");
        hs.add("Jagruti");
        System.out.println(hs);
       Iterator it = hs.iterator();
       while (it.hasNext()) {
           System.out.println(it.next());

       }


    }
}
