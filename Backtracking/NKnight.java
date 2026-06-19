package Backtracking;

public class NKnight {
    public static void main(String[] args) {
        int n = 4 ;
        boolean [][] board = new boolean[n][n];
        nKnight(board,0,0,3);
    }
    public static void nKnight(boolean [][] board , int row , int col , int knight){
        if(knight == 0){
            display(board);
            System.out.println();
            return ;
        }
        if(row == board.length -1 && col == board.length){
            return ;
        }
        if(col == board.length){
            nKnight(board, row + 1, 0, knight);
            return ;
        }
        if(isSafe(board, row, col)){
            board[row][col] = true ;
            nKnight(board, row, col + 1, knight - 1);
            board[row][col] = false ;
        }
        nKnight(board, row, col + 1, knight);
    }
    public static boolean isSafe(boolean [][] board , int row , int col){
        if(isValid(board, row - 2, col - 1 )){
            if(board[row - 2][col -1]){
                return false ;
            }     
        }
        if(isValid(board, row -2 , col + 1)){
              if(board[row - 2][col + 1]){
                return false ;
            }    
        }
  
        if(isValid(board, row - 1, col + 2 )){
              if(board[row - 1][col + 2]){
                return false ;
            }    
        }
        if(isValid(board, row - 1 , col - 2)){
              if(board[row - 1][col - 2]){
                return false ;
            }    
        }
        return true ;
    }
    public static boolean isValid(boolean [][]board ,int row ,int col ){
        if(row >= 0 && row <= board.length - 1 && col >= 0 && col <= board.length - 1){
            return true ;
        }
        return false ;
    }
    public static void display(boolean [][] board){
       for(int i = 0 ; i < board.length ; i++ ){
            for(int j = 0 ; j < board.length ; j++){
                if (board[i][j]  == true) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
