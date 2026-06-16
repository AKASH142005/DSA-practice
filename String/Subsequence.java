package String;
import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
       
         System.out.print(subseqListAscii("", "abc"));
    }
    public static void subseq(String p ,String s){

        if(s.isEmpty()){
            System.out.print(p + " ");
            return ;
        }
        char ch = s.charAt(0);
        subseq(p + ch, s.substring(1));
        subseq(p,s.substring(1));
    }

    public static ArrayList <String> subseqList(String p ,String s){
        if(s.isEmpty()){
            ArrayList <String> list = new ArrayList<>() ;
            list.add(p);
            return list;
        }
        char ch = s.charAt(0);
        ArrayList <String> left = subseqList(p + ch, s.substring(1));
        ArrayList <String> right = subseqList(p, s.substring(1));
        left.addAll(right);
        return left ;
    }

        public static ArrayList <String> subseqListAscii(String p ,String s){
        if(s.isEmpty()){
            ArrayList <String> list = new ArrayList<>() ;
            list.add(p);
            return list;
        }
        char ch = s.charAt(0);
        ArrayList <String> first = subseqListAscii(p + ch, s.substring(1));
        ArrayList <String> second = subseqListAscii(p, s.substring(1));
        ArrayList <String> third = subseqListAscii(p + (ch + 0), s.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first ;
    }
}
