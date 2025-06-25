package TreeMap;
import java.util.TreeMap;

public class JavaInTreeMap {
    public static void main(String[] args) {
        TreeMap<String , Integer> tm = new TreeMap<>();  // key are sorted in alphabetical order 
        tm.put("india", 23);                           // put , get , remove  folloe O(nlogn)
        tm.put("china", 33);
        tm.put("australia", 44);
        tm.put("thailand", 55);

        System.out.println(tm);
        
    }
    
}
