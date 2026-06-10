package Bitwise;

public class NoOfSetBits {
    public static void main(String[] args) {
        int n =457990 ;
        int count = 0 ;
        System.out.println(Integer.toBinaryString(n));
        /*while(n > 0){
            count++ ;
            n -= (n & (-n));
        } */
        
        while(n > 0){
            count++ ;
            n = (n & (n-1));
        }
        System.out.println(count);
    }
}
