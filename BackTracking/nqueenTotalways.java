public class nqueenTotalways {
    public static boolean issafe(char board[][] , int raw , int col){
        //vertical up 
        for(int i=raw-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // left diag up
        
        for(int i=raw-1,j=col-1;i>=0 &&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }

        }

        // right diag up

        for(int i=raw-1,j=col+1;i>=0 &&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }

        }

        return true;



    }
    public static void nqueen(char board[][], int i){
        if(i==board.length){
        //    printboard(board);
        count ++;
            return;
        }
       
            for(int j=0;j<board.length;j++){
                if(issafe(board,i,j)){
                board[i][j]='Q';
                nqueen(board, i+1);
                board[i][j]='.';
    

        }
        

    }
}
    public static void printboard(char board[][]){
        System.out.println("------cheass borad-----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");

            }
            System.out.println();
        }

    }

    static int count =0;
    public static void main(String[] args) {
        int n=4;
        char board[][]= new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';

            }
        }
        nqueen(board , 0);
        System.out.println("total ways = " + count );
    }

    
    
}
