public class pair_of_array {
    public static void pair(int arr[]){
        for(int i =0;i< arr.length ;i++){
            int fixed =arr[i];
            for(int j=i+1;j<arr.length;j++){
                
                System.out.print("("+fixed +","+arr[j]+")");

            }



        }
    }
    public static void main(String[] args) {
       int arr[]={2,4,6,8,10};
       pair(arr);
        
    }
    
}
