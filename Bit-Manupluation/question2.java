public class question2 {
    //number is 2 to the power or not ?
    public static void twotothepower(int n ){
        
        if ((n & (n-1))==0){
            System.out.println(" the number is 2 to the power");

        }
        else{
            System.out.println(" the number is not  2 to the power");

        }

    }

    public static void main(String[] args) {
         twotothepower(128 );
        
    }
    
}
