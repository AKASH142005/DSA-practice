package Bitwise;

public class FindItsPowerOf2 {
    public static void main(String[] args) {
        // Zero is the Exception case
            
        int n = 3 ;
        int ans =  (n & n - 1);
        System.out.print((n!= 0) && (ans == 0)? "Yes":"False");
    }
    
}
