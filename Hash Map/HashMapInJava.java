
import java.util.HashMap;

public class HashMapInJava{
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("india", 23);
        hm.put("china", 33);
        hm.put("australia", 44);
        hm.put("thailand", 55);


        System.out.println(hm);
        System.out.println(hm.get("india"));
        System.out.println(hm.get("ind"));

        System.out.println(hm.containsKey("china"));

        System.out.println(hm.remove("china"));
        System.out.println(hm);

        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        
    }

}







