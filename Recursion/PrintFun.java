package Recursion;

public class PrintFun{
    public static void main(String[] args) {
        // call single function and then print 12345
        // it is a core mechanism for the recursion without calling multiple function we need into some thing handy 

        print(1); 
    }
    public static void print(int n){
        System.out.println(n);
        print2(2);
    }
     public static void print2(int n){
        System.out.println(n);
        print3(3);
    }
     public static void print3(int n){
        System.out.println(n);
        print4(4);
    } public static void print4(int n){
        System.out.println(n);
    } 

    
}