public class Palindrome {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0 ;i < 26 ; i++){
            char ch = 'a';
            builder.append((char)(ch + i));
        }
        System.out.println(builder.toString());
    

        String s = "abab"; 

        System.out.print(palindrome(s));
    }
    public static boolean palindrome(String s){ 
    for(int i = 0 ; i <= s.length() /2;i++){
            s = s.toLowerCase();
            if(s == null || s.length() == 0){
                return true;
            }
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false ;
            }
    }
    return true ;
}
}
