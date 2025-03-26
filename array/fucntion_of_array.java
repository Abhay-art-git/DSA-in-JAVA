public class fucntion_of_array {
    public static void update(int arr[] , int c){
        c = c+111;
        System.out.println("function in "+ c);
        for(int i =0;i<arr.length ; i++){
            arr[i]=arr[i]+1;
            System.out.println(arr[i]);


        }

    }
    public static void main(String[] args) {
        int c = 5;
        int arr[]={97,98,99};
        update(arr , 10);
        System.out.println(c);

    }
    
}
