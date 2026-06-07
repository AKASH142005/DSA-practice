package Recursion;

public class Fiboncci {
    public static void main(String[] args) {

        System.out.print(fibonacci(7));
    }
    public static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci( n-2);
    }
}
