public class search_sortarray {
    public static boolean  staircasesearch( int matrix[][] , int key){
        int row=0 , col = matrix[0].length-1;

        while( row <matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.println("element is found : "+ "(" + row + "," + col + ")");
                return true ;

            }
            else if( key < matrix[row][col]){
                col--;
            }
            else{
                row ++ ;
            }

        }

        System.out.println("element not found !");
        return false ;

    }
    public static void main(String[] args) {
        int matrix[][] ={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int key = 33;
        staircasesearch(matrix , key);
    }
    
}
