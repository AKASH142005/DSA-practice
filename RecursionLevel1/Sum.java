package RecursionLevel1;

public class Sum {
    public static void main(String[] args) {
        int n = 2;
        System.out.print(sum(n));
    }
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n - 1);
    }
}
