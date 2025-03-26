public class reverseofarray {
    public static void reverse(int arr[]){
        int first =0;
        int last = arr.length-1;
        while(first<last||first==last){
            int swap =  arr[last];
            arr[last]=arr[first];
            arr[first]=swap;
            
            first = first+1;
            last = last-1;
          



        }
       
        

    }
    public static void main(String[] args) {
       int  arr[]={2,4,6,8};
     reverse(arr);
     for(int i =0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
     }
    

        
    }
    
}
