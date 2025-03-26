import java.util.*;

public class array{
    public static void main(String[] args) {
        int arr[] = new int[100];
        Scanner input = new Scanner(System.in);
        System.out.println("eneter the array elements ");
        arr[0]=input.nextInt();
        arr[1]=input.nextInt();
        arr[2]=input.nextInt();

        System.out.println("first elementys of array : " + arr[0]);
        System.out.println("second elemnets of array:  " +arr[1]);
        
        System.out.println("length of array " +arr.length);
    }
}