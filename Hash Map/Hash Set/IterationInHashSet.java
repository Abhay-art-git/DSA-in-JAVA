package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class IterationInHashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("delhi");
        hs.add("noida");
        hs.add("bangluru");
        hs.add("punjab");


        Iterator it = hs.iterator();  // its a method used for set iteration

      while (it.hasNext()) {
        System.out.println(it.next()); 
          
      }
   // method for using for each loop for iteration 
         for(String city : hs){
        System.out.println(city);
      }


        
          

    }

    
}
