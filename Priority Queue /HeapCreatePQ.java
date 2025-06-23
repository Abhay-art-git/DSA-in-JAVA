
import java.util.ArrayList;

public class HeapCreatePQ {

    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add( int data){
            arr.add(data);  // data add at last position 

            int ch = arr.size()-1;  // child index
            int par = (ch-1)/2;     // parent index

            while(arr.get(ch)<arr.get(par)){  //swap parent child   O(log(n))
                int temp = arr.get(ch);
                arr.set(ch , arr.get(par));
                arr.set(par , temp);

                ch =par;
                par = (ch-1)/2;
            }
        }

        public int  peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minidx = i ;// root 

            if(left <arr.size()&& arr.get(minidx)>arr.get(left)){
                minidx = left;
            }

             if(right <arr.size()&& arr.get(minidx)>arr.get(right)){
                minidx = right;
            }

            if(minidx != i){
                // swap

                int temp = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, temp);


                heapify(minidx);
            }

        }

        public int remove(){
            int data = arr.get(0);

            // step 1 : last and first swap
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);
            
            // step 2 : delete last
            arr.remove(arr.size()-1);

            //step 3: heapify 
            heapify(0);
            return data;


        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
        

        
    }
    
}
