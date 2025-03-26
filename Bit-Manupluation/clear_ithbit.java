public class clear_ithbit {  
    public static int bitmaniplution(int n , int i){
        int bitmask = (-1<<i);
        return (n&bitmask);

    }

    public static int ithrangebit(int n , int i , int j ){
        int a = (-1<<(j+1));
        int b = ((1<<i)-1);
        int bitmask = a|b;
        return (n&bitmask);

    }
    public static void main(String[] args) {
        System.out.println(bitmaniplution(15 , 2));  
        System.out.println(ithrangebit(10,2,4));
        
        
    }
    
}
