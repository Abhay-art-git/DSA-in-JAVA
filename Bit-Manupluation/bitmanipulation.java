public class bitmanipulation {
    public static void evenorodd(int n){
        int bitmask = 1;
        if((n&1)==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }

    }

    public static int ithbit(int n1, int i){
        int bitmask = ~(1<<i);
        return n1 &bitmask;
        
         
        


    }

    
    public static void main(String[] args) {
        evenorodd(3);
        evenorodd(1);
       System.out.println(ithbit(10,1  ) ); 
         


        
    }
      
    
}
