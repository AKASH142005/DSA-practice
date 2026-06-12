package RecursionLevel1;

public class Factorial {
    public static void main(String[] args) {
        int n = factorial(5);
        System.out.print(n);
    }
    public static int factorial(int n){
        if(n <= 1){
            return 1 ;
        }
        return n * factorial(n - 1);
    }

}
