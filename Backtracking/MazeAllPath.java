package Backtracking;

import java.util.Arrays;

public class MazeAllPath {
    public static void main(String[] args) {
        boolean [][] maze = {
            {true ,true ,true},
            {true ,true,true},
            {true ,true ,true}
        } ;
        int[][] path = new int[maze.length][maze[0].length];

        //allPath("",maze, 0, 0);
        allPathPrint("",maze,0,0,path,1);
    }
    public static void allPath(String p , boolean [][] maze , int c , int r){
        if(c == maze.length - 1 && r <= maze[0].length -1) {
            System.out.println(p);
            return ;
        }

        if(!maze[r][c]){
            return ;
        }

        maze[r][c] = false ;

        if(r < maze.length - 1){
            allPath(p + 'D', maze, c, r + 1);
        }
        if(c < maze.length - 1){
            allPath(p + 'R', maze, c + 1, r);
        }
        if(r > 0){
            allPath(p + 'U', maze, c, r - 1);
        }
        if(c > 0){
            allPath(p + 'L', maze, c - 1, r);
        }

        maze[r][c] = true ;
    }


    public static void allPathPrint(String p , boolean [][] maze , int c , int r ,int [][] path ,int step){
        if(c == maze.length - 1 && r == maze[0].length -1) {
             path[r][c] = step ;
            for(int [] i : path){
                System.out.println(Arrays.toString(i));
            }
            System.out.println(p);
            System.out.println();
            return ;
        }

        if(!maze[r][c]){
            return ;
        }
        path[r][c] = step ;
        maze[r][c] = false ;

        if(r < maze.length - 1){
            allPathPrint(p + 'D', maze, c, r + 1,path ,step + 1);
        }
        if(c < maze.length - 1){
            allPathPrint(p + 'R', maze, c + 1, r,path ,step + 1);
        }
        if(r > 0){
            allPathPrint(p + 'U', maze, c, r - 1,path ,step + 1);
        }
        if(c > 0){
            allPathPrint(p + 'L', maze, c - 1, r,path ,step + 1);
        }
         maze[r][c] = true ;
         path[r][c] = 0 ;
    }
}
