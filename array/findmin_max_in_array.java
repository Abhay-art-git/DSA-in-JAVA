public class findmin_max_in_array {
    public static int getmax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }

        }
        return max;
    }
    public static int gatmin(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];

            }

        }
        return min ;
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,3,5};
            System.out.println("the largest element of " + getmax(arr)); 
            System.out.println("the smallest element of " + gatmin(arr));
        
        
    }
    
}
