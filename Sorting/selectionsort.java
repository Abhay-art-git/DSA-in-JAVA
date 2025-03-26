public class selectionsort {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int min=i;
                if(arr[min]>2arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;


                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={4,2,1,3,5};
        selectionSort(arr);

    }
    
}
