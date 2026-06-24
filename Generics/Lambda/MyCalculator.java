package Generics.Lambda;

public class MyCalculator {



    public int operate(int a ,int b , Operation op ){
        return op.operation(a, b);
    }
    public static void main(String[] args) {
        MyCalculator cal = new MyCalculator();
        Operation sum = (a,b) -> a + b ;
        Operation div = (a,b) -> a / b;
        Operation mul = (a,b) -> a * b;
        Operation mod = (a,b) -> a % b;
        System.out.println(cal.operate(4, 4, mul));
        System.out.println(cal.operate(4, 4, div));
        System.out.println(cal.operate(4, 4, sum));
        System.out.println(cal.operate(4, 4, mod));
        
    }

}

interface Operation {
    public int operation (int a , int b);
}