package Backtracking;

public class Queens {
    public static void main(String[] args) {
        int n = 4 ;
        boolean [][] board = new boolean[n][n] ;
        System.out.print(queens(board, 0)) ;
    }
    public static int queens(boolean [][] board , int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1 ;
        }
        int col = 0 ;
        int count = 0 ;
        for( col = 0 ;col < board.length ;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true ;
                count += queens(board, row + 1) ;
                board[row][col] = false ;
            }
        }
        return count ;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // for vertical row
        for(int i = 0 ; i < row ; i++){
            if(board[i][col]){
                return false ;
            }
        }

        // for max left 
        int maxLeft = Math.min(row,col);
        for(int i = 1 ; i <= maxLeft ; i++){
            if(board[row - i][col - i]){
                return false ;
            }
        }

        int maxRight = Math.min(row , board.length - col - 1);

        for(int i = 0 ; i <= maxRight ; i++){
            if(board[row - i][col + i]){
                return false ;
            }
        }
        return true ;
    }
    public static void display(boolean [][] board)
    {
        for(int i = 0 ; i < board.length ; i++ ){
            for(int j = 0 ; j < board.length ; j++){
                if (board[i][j]  == true) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
