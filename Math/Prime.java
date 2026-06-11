package Math;

public class Prime {
    public static void main(String[] args) {
        int n = 17 ;
        System.out.println(prime(n));
    }
    static boolean prime(int n){
        int c = 2;
        while (c*c <= n) {
            if(n % c == 0){
                return false ;
            }
            c++;
        }
        return true ;
    }
}
