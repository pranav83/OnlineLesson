package GitByPranav;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap<I extends Number, S> {
    public static void main(String[] args) {
            java.util.HashMap<Integer, String> hm = new java.util.HashMap<Integer, String>();
            hm.put(0,"Pranav");
            hm.put(1,"Neelraj");
            hm.put(2,"Jagruti");
            hm.put(3,"Tisha");
        System.out.println( hm.get(3));
        System.out.println(hm);
        System.out.println(0);
       Set sn =  hm.entrySet();
      Iterator it = sn.iterator();
      while (it.hasNext()) {
          Map.Entry mp = (Map.Entry) it.next();
          System.out.println(mp.getKey());
          System.out.println(mp.getValue());
      }
    }
}
