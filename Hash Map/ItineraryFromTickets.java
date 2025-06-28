import java.util.HashMap;

public class ItineraryFromTickets {
    public static String StartFrom( HashMap<String , String> journay){
        HashMap<String , String> map = new HashMap<>();

        for(String key : journay.keySet()){
            map.put(journay.get(key), key);

        }

       for(String key : journay.keySet()){
            if(!map.containsKey(key)){
                return key;

            }

        }

        return "null";

    }
    public static void main(String[] args) {
        HashMap<String , String> journay = new HashMap<>();
        journay.put("chennai" , "bangluru");
        journay.put("mumbai", "delhi");
        journay.put("goa", "chennai");
        journay.put("delhi", "goa");

        String start = StartFrom(journay);

          System.out.print(start);
        for(String key : journay.keySet()){
            System.out.print(" -> "+journay.get(start));
            start = journay.get(start);


        }



        
    }
}      
