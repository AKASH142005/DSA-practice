package RecursionLevel1;

public class Numers {
    public static void main(String[] args) {
        funBoth(5);
    }
    public static void fun(int n){
        if(n == 0){
            return ;
        }
        System.out.println(n);
        fun(n - 1);
    }
    public static void fun1(int n){
        if(n == 0){
            return ;
        }
        fun1(n - 1);
         System.out.println(n);
    }
    public static void funBoth(int n){
        if(n == 0){
            return ;
        }
         System.out.println(n);
        funBoth(n - 1);
         System.out.println(n);
    }

}
