import java.util.LinkedHashMap;

public class JavaInLinkedHashMap{
    public static void main(String[] args) {
        
        LinkedHashMap<String , Integer > lhm = new LinkedHashMap<>();   // keys are in inserted order follow 
        lhm.put("india", 44);
        lhm.put("noida", 33);
        lhm.put("china", 22);

        System.out.println(lhm);   // we print the linkedHashMap its follow inserted order 
        
    }

}
