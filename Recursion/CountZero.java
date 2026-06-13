package Recursion;

public class CountZero {
    public static void main(String[] args) {
        int n =32030400 ;

        int ans = count(n , 0);
        System.out.print(ans);
    }
    public static int count(int n ,int c){
        if(n % 10 == n){
            return c;
        }
        if(n % 10 == 0){
            return count(n/10, ++c);
        }
        return count(n/10 ,c);
    }
}
