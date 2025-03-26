public class firstoccurance {
    public static int firstoccurancearray( int arr[] , int key , int i){
        if(i == arr.length-1){
            return -1 ;
        }
        if(arr[i]==key){
            return i;

        }
        return firstoccurancearray(arr, key, i+1);
        


    }
    public static void main(String[] args) {
        int arr[] = {1,3,6,4,3,6,7,8,9};

        
        System.out.println(firstoccurancearray( arr , 3, 0));
    }
    
}
