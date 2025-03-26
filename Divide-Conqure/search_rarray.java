public class search_rarray{
    public static int search( int arr[] , int tar , int si , int ei){
        if(si>ei){
            return -1;

        }
        // mid 
        int mid = si+(ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }

        if(arr[si] <= arr[mid]){
            //case a 
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, tar, si, mid-1);


            }
            //case b
            else{
                return search(arr, tar, mid+1, ei);

            }

        }else{

            if(tar<=arr[ei]&& arr[mid]<=tar){
                return search(arr, tar, si, mid+1);
            }
            else{
                return search(arr, tar, mid+1, ei);

            }

        }


    }



    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target =0; //output = 4
        int taridx = search(arr, target, 0 , arr.length-1);
        System.out.println(taridx);
        
    }


}