



public class insertionSort {
    public static void insertinsort(int arr[] ){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int pre =i-1;
            while(pre>=0 && arr[pre]>curr){
                arr[pre+1]=arr[pre];
                pre--;
            }
            arr[pre+1]=curr;

            }

        
        

           


        
        for(int k=0; k<arr.length;k++){
            System.out.print(arr[k]);
            System.out.print(" ");
        }    
    }
    public static void main(String[] args) {
        int num[] ={5,3,4,2,1};
        insertinsort(num);
        
    }

    
}
