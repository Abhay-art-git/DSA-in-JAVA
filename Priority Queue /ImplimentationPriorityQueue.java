
import java.util.PriorityQueue;


public class ImplimentationPriorityQueue{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // priority Queue implimentaion
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); priority Queue for Reverse Order
        pq.add(2);
        pq.add(4);
        pq.add(1);
        pq.add(8);

       while (!pq.isEmpty()) {
        System.out.println(pq.peek());
        pq.remove(); 
           
       }
        
        
        
    }

}
