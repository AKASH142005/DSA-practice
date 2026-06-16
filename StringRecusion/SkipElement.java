package StringRecusion;

public class SkipElement {
    public static void main(String[] args) {
        String p = "";
        String s = "kashaca";
        skip(p, s);
        System.out.println(p);

        
        System.out.println(skip1(s));

        System.out.println(skipApple("aksapplesdh"));
        System.out.println(skipAppNotApple("akashapple"));
    }
    public static void skip(String p , String s){
        if(s.isEmpty()){
         System.out.println(p);
            return ;
        }
        char ch = s.charAt(0);
        if(ch == 'a'){
            skip(p,s.substring(1));
        } else {
            skip(p + ch,s.substring(1));
        }

    }

    public static String skip1( String s){
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if(ch == 'a'){
            return skip1(s.substring(1));
        } else {
            return ch + skip1(s.substring(1));
        }
    }

    public static String skipApple(String s){
        if(s.isEmpty()){
            return "" ;
        }
        if(s.startsWith("apple")){
           return skipApple(s.substring(5));
        } else {
           return s.charAt(0) + skipApple(s.substring(1));
        }
    }

    public static String skipAppNotApple(String s){
        if(s.isEmpty()){
            return "" ;
        }

        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipAppNotApple(s.substring(3));
        } else {
            return s.charAt(0) + skipAppNotApple(s.substring(1));
        }
    }
}
