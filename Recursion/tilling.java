public class tilling{

    public static int total_tilling(int n ){
        if(n==0||n==1){
            return 1;


        }

        //choice 
        //vertical
        int verticalChoice = total_tilling(n-1);

        //horizontal
        int horizontalchoice = total_tilling(n-2);


        //total ways
        int total = verticalChoice +horizontalchoice;
        return total;


    }
    public static void main(String[] args) {
        System.out.println(total_tilling(3));
        
    }
}