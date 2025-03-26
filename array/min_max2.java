

public class min_max2{
    public static int max_min(int nums[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
            

        }
        return min;




    }

    public static int min_max(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,5,9};
       System.out.println(max_min(nums));
       System.out.println(min_max(nums));
        
    }
}