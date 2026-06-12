package RecursionLevel1;

public class Reverse {
    static int sum = 0 ;
    public static void main(String[] args) {
        System.out.println(rev2(12399));
        rev(1383);
        System.out.println(sum);
    }
    public static void rev(int n){
        if(n == 0){
            return ;
        }
        int rem = n % 10 ;
        sum = sum*10 + rem ;
        rev(n/10);  
    }
    public static int rev2(int n){
        int args = (int)Math.log10(n) + 1;
        return helper(n, args);
    }
    public static int helper(int n ,int args){
        if(n%10 == n){
            return n ;
        }
        return ((n % 10 )* (int)(Math.pow(10, args -1))) + helper(n/10, --args);
    }
    
}