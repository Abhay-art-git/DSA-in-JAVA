import java.util.*;
public class revise {
5
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int n = arr.length ;
        int m = arr[0].length;

        Scanner input = new Scanner(System.in);

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
            
                arr[i][j]=input.nextInt();

            }
        }

        for (int i=0; i<n; i++){
            for(int j=0; j<m ;j++){
                System.out.print( arr[i][j] + " ");
            }
            System.out.println();
        }
         
    



        
    }
    
}
