public class binary_search {
    public static int  binary_search(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
         while (start <=end){
           int mid= (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if (arr[mid]<key) {
                start = mid+1;


          
                
            }
            else{
                end = mid -1;
            }

         }
         
 return -1;
        }
    
    public static void main(String[] args) {
        int arr[]={ 2,4,6,8,10,12,14};
        
       
        System.out.println( "the key is = "+ binary_search(arr,3
        ));

        
    }
    
}
