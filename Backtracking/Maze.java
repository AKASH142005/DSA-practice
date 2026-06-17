package Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        int n = 3 ;
        System.out.println(pathCount(n, n));
        path("", n, n);
        System.out.println(pathList("", n, n));
        System.out.println(pathDiagonalList("", n, n));
    }
    public static int pathCount(int c ,int r){
        if(c==1||r==1){
            return 1 ;
        }
        int left = pathCount( c-1, r);
        int right = pathCount(c, r -1);
        return left + right ;
    }

    public static void path(String p ,int c,int r){
        if(r==1&&c==1){
            System.out.println(p);
            return ;
        }
        if(r > 1){
              path(p+'D', c, r-1);
        }
        if(c > 1){
             path(p+'R', c-1, r);
        }
    }

    public static ArrayList<String> pathList(String p ,int c,int r){
        if(r==1&&c==1){
            ArrayList<String> list = new ArrayList<>() ;
            list.add(p);
            return list;
        }
            ArrayList<String> list = new ArrayList<>() ;
        if(r > 1){
             list.addAll(pathList(p+'D', c, r-1));
        }
        if(c > 1){
             list.addAll(pathList(p+'R', c-1, r));
        }
        return list ;
    }
    public static ArrayList<String> pathDiagonalList(String p ,int c,int r){
        if(r==1&&c==1){
            ArrayList<String> list = new ArrayList<>() ;
            list.add(p);
            return list;
        }
            ArrayList<String> list = new ArrayList<>() ;
        if(r > 1 && c > 1){
            list.addAll(pathDiagonalList(p+'D', c-1, r-1));
        }
        if(r > 1){
             list.addAll(pathDiagonalList(p+'V', c, r-1));
        }
        if(c > 1){
             list.addAll(pathDiagonalList(p+'H', c-1, r));
        }
        return list ;
    }
}
