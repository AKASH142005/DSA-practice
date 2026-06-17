package Backtracking;
public class MazeWithObstacle {
    public static void main(String[] args) {
        boolean [][] obstacle = {
            {true ,true ,true},
            {true ,false,true},
            {true ,true ,true}
        } ;
        path("", obstacle, 0, 0);

    }

    public static void path(String p ,boolean [][] obstacle ,int r ,int c){
        if(r == obstacle.length - 1 && c == obstacle[0].length - 1){
            System.out.println(p);
            return ;
        }

        if(obstacle[r][c] == false){
            return ;
        }

        if(r < obstacle.length - 1){
            path(p+"V", obstacle, r+1, c);
        }
        if(c < obstacle.length - 1){
            path(p+"H", obstacle, r, c+1);
        }
       
    
    }
}
