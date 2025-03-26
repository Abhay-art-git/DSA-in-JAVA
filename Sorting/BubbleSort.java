public class BubbleSort{
    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int swap =0; // it is used when ypu given sorted array
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap +=1; // when you get sorted array use can not itterate n^2 time compexcity

                }

            }
        }
        for(int k=0; k<arr.length;k++){
            System.out.print(arr[k]);
            System.out.print(" ");
        }    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};

        bubblesort(arr);
        
    }
}