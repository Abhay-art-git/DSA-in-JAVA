import java.util.*;
public class javacollectionQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(3);
        q.add(7);
        q.add(9);


        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
