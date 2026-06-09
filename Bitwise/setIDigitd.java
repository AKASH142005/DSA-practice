package Bitwise;
public class setIDigitd{
    public static void main(String[] args) {
        int n = 40 ;
        System.out.println(Integer.toBinaryString(n));
        int k = 5 ;
        
        int ans = (n | (1 <<(k-1)));
        System.out.println(ans);
        System.out.println(Integer.toBinaryString(ans));
    }
}