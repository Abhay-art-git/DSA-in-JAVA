public class xtopowern {
    public static int ispower(int x , int n){
        if(n==1){
            return x;

        }
        return x*ispower(x , n-1);

    }
    public static void main(String[] args) {
        
        System.out.println(ispower(2,10));
        
    }
    
}
