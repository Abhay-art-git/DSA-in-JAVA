import java.util.*;

public class IterationInHashMap {
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("india", 23);
        hm.put("china", 33);
        hm.put("australia", 44);
        hm.put("thailand", 55);

        Set<String> key = hm.keySet();

        for(String k : key){
            System.out.println( k+" : "+ hm.get(k));

        }

    }
    
}
