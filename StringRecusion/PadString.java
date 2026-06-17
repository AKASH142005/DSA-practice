package StringRecusion;

import java.util.ArrayList;

public class PadString {
    public static void main(String[] args) {
        String s = "12";
        pad("", s);
        System.out.print(padSeq("", s));
    }
    public static void pad(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        int digit = up.charAt(0) - '0';
        for(int start = (digit -1)*3 ; start < (digit *3) ;start++){
            char ch = (char)('a'+ start);
            pad( p + ch , up.substring(1));
        }
    }

    public static ArrayList<String> padSeq(String p , String up){
        if(up.isEmpty()){
            ArrayList <String> list = new ArrayList<>() ;
            list.add(p);
            return list;
        }
        ArrayList <String> ans = new ArrayList<>() ;
        int digit = up.charAt(0) -'0';
        for(int i = (digit - 1)*3 ;i < digit*3 ;i++){
            char ch = (char)('a' + i);
            ans.addAll(padSeq(p+ch, up.substring(1)));
        }
         return ans ;
    }
    
}
