package RecursionLevel1;

public class Reverse {
    public static void main(String[] args) {
        
    }
    public static int rev(int n){
        if(n%10 == n){
            return n ;
        }
        int sum = 0 ;
        int rem = n % 10 ;
        sum = sum*10 + rem ;
        rev(n/10);  
    }
}
