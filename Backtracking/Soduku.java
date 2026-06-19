package Backtracking ;

import java.util.Arrays;

public class Soduku {
    public static void main(String[] args) {
        int[][] board = {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if(soduku(board)){
            for(int [] arr: board){
                System.out.println(Arrays.toString(arr));
            }
        }
    }

    public static Boolean soduku(int [][] board ){

        int n = board.length ;
        int row = -1 ;
        int col = -1 ;
        
        boolean isEmpty = true ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n; j++){
                if(board[i][j] == 0){
                    row  = i ;
                    col = j ;
                    isEmpty = false ;
                    break ;
                }
            }
            if(isEmpty == false){
                break ;
            }
        }

        if(isEmpty == true ){
            return true ;
        }

        for(int number = 1 ; number <= board.length ; number++){
            if(isSafe(board, row, col, number)){
                board[row][col] = number ;
                if(soduku(board)){
                    return true ;
                } 
               board[row][col] = 0 ;
        }
    }
   return false ;
    }
    public static boolean isSafe(int [][] board , int row ,int col ,int num){
        for(int i = 0 ; i < board.length ; i++){
            if(board[row][i] == num){
                return false ;
            }
        }
        for(int [] nums : board){
            if(nums[col] == num){
                return false ;
            }
        }
        int end = (int) Math.sqrt(board.length);
        int rowStart = row - (row % 3);
        int colStart = col - (col % 3);

        for(int r =  rowStart; r < rowStart + end ; r++){
            for(int c = colStart ;c < colStart + end ; c++){
                if(board[r][c] == num){
                    return false ;
                }
            }
        }
        return true ;
    }
}