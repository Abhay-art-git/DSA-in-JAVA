
import java.util.ArrayList;

public class pairSum {
    // brute force approch
    public static boolean pairSumProblem( ArrayList<Integer> list , int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)== target){
                    return true;
                }
            }
        }
        return false;

    }

    public static boolean  pairsymproblem_optimized(ArrayList<Integer> list , int target){
        //two pointer approch
        int lp=0;
        int rp = list.size()-1;
        while(rp>lp){
            if(list.get(lp)+list.get(rp)== target){
            return true;
        }
        else if(list.get(lp)+list.get(rp)<target){
            lp++;
        }
        else{
            rp--;
        }
        }
        return false;

        


        
    }
    public static void main(String[] args) {
        int target = 5;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(pairsymproblem_optimized(list, target));
        // System.out.println(pairSumProblem(list,target));



        
    }
    
}
