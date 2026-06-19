package StringRecusion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permutation("", "abc");

         System.out.print(permutation2("", "abcd"));
    }
    public static void permutation(String p , String s){
        if(s.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = s.charAt(0);
        for(int i = 0 ; i <= p.length() ; i++){
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            permutation(first + ch + second, s.substring(1));
        }
    }

    public static ArrayList<String> permutation2(String p , String s){
        ArrayList<String> list = new ArrayList<>() ;
        if(s.isEmpty()){
            list.add(p);
            return list;
        }
        
        ArrayList<String> ans = new ArrayList<>() ;
        char ch = s.charAt(0);
        for(int i = 0 ; i <= p.length() ; i++){
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            ArrayList <String> list2 = permutation2(first + ch + second, s.substring(1));
            ans.addAll(list2);
        }
        return ans ;
    }
}
