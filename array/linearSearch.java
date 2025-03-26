public class linearSearch {
    public static int binarySearch(int arr[], int key ){
        for(int i =0; i<arr.length; i++){
          if( arr[i]==key){
            return i;
          }
          
         
          
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16};
       int index= binarySearch(arr, 10);
        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println( index );
        }
        
    }
    
}
