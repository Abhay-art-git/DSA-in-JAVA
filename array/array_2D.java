import java.util.*;
public class array_2D {
    public static int search(int arr[][], int key){
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("element found ("+i+","+j+")");
                    return  1 ; 
                }
                
                
                }
    
            }
        return key;
            
        }

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int arr[][]= new int[3][3];
        int n =arr.length ,m=arr[0].length;
        System.out.println("enter the data for 2d array");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("your  2d array elements ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print( arr[i][j] +" ");
               
                

            }
            System.out.println( );
        }
        search( arr,5);


        
    }
    
}
