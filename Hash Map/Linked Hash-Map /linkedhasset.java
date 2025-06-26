
import java.util.*;

public class linkedhasset {
        public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("delhi");
        hs.add("noida");
        hs.add("bangluru");
        hs.add("punjab");
        System.out.println(hs);


        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("delhi");
        lhs.add("noida");
        lhs.add("bangluru");
        lhs.add("punjab");

        System.out.println(lhs);     

    }

    
}

    

