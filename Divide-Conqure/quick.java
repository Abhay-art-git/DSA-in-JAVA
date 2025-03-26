public class quick {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]  +" ");
        }

    }
     public static void quicksort(int arr[] , int si , int ei ){
        if(si==ei||si>ei){

            return;
        }

        int pvtidx = partition(arr,si,ei);

        quicksort(arr,si , pvtidx-1);
        quicksort(arr,pvtidx+1,ei);
         


     }

     public static int partition(int arr[] , int si , int ei){
        int pvt = arr[ei];
        int i = si-1;
        
        for(int j=si;j<arr.length;j++){
            if(arr[j]<=pvt){
                i++;
                //swap
                int temp =arr[j];
                arr[j]=arr[i];
                arr[i]=temp;


            }
        }       i++;
                int temp =pvt;
                arr[ei]=arr[i];
                arr[i]=temp;
                return i;



     }

    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quicksort(arr , 0 , arr.length-1);
        printArr(arr);

        
    }
    
}
