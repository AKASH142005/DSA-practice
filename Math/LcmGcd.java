package Math ;

public class LcmGcd {
    public static void main(String[] args) {
        int a = 15 ;
        int b = 20 ;
        int gcd = GCD(a, b) ;
        System.out.println(gcd);
        System.out.println(LCM(a, b, gcd));
    }
    public static int GCD(int a ,int b){
        if(a == 0){
            return b ;
        }
         return GCD(b % a ,a);
    }
    public static int  LCM(int a ,int b ,int gcd){
        int ans = a*b/gcd ;
        return ans;
    }
}
