import java.util.*;
public class min_max{

    public static void max_min(int num[] ){
        Arrays.sort(num);
        System.out.println("minimun element of array : "+num[0]); 

        System.out.println("maximum element of array : "+ num[num.length-1]);
       
        
    }
    public static void main(String[] args) {
        int num[]={2,4,6,1,7,8};
        max_min(num);
        
    }
    
}