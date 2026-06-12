package Math;

public class NewtonSquareRoot {
    public static void main(String[] args) {
        System.out.print(squareRoot(19));
    }
    public static double squareRoot(int n){
        double x = n ;
        double root ;

        while(true){
            root = 0.5 * (x + (n/x));
            if(Math.abs(x-root) < 0.5){
                break ;
            }
            x = root  ;
        }
        return root ;
    }
}
