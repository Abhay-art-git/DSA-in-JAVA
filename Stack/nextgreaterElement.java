import java.util.*;
public class nextgreaterElement {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int arr[] ={6,8,0,1,3};
        int nxtgrt[] = new int [arr.length];

        for(int i=arr.length-1;i>=0;i--){
            //1
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            //2
            if(s.isEmpty()){
                nxtgrt[i] = -1;
            }
            else{
                nxtgrt[i]=arr[s.peek()];
            }
            s.push(i);


        }

        for(int i=0;i<nxtgrt.length;i++){
            System.out.println(nxtgrt[i]);
        }


        
        
    }
    
}
