package RecursionLevel1;

public class Product {
    public static void main(String[] args) {
        int product = product(125);
        System.out.print(product);
    }
    public static int product(int n){
        if(n%10 == n){
            return n ;
        }
        return (n%10) * product(n/10);
    }
}
