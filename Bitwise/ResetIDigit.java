package Bitwise;

public class ResetIDigit {
    public static void main(String[] args) {
         int n = 18 ;
        System.out.println(Integer.toBinaryString(n));
        int k = 2 ;
        
        int ans = (n & (~(1 <<(k-1))));
        System.out.println(ans);
        System.out.println(Integer.toBinaryString(ans));
    }
}
