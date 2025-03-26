
import java.util.ArrayList;

public class containerWithWaterProblem {
    public static int containWater(ArrayList<Integer> height){
        int currwater =0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int heg = Math.min(height.get(i) , height.get(j));
                int width = j - i ;
                int area = heg * width;
                currwater = Math.max(currwater , area);

            }

        }
        return currwater;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(containWater(list));


    }

}
