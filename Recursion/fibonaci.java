public class fibonaci{
    public static int fibonaci(int n ){
          if(n==0||n==1){
            return n;

          }
          int fn1 = fibonaci(n-1);
          int fn2 = fibonaci(n-2);
          int fn = fn1 +fn2 ;

          return fn;

        

       

        

    }
    public static void main(String[] args){
        System.out.println(fibonaci(5));
        
    }

}