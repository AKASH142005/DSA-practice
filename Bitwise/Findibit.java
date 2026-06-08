package Bitwise;

public class Findibit {
    public static void main(String[] args) {
        int pos = 4;
        int n = 12 ;

        if ((n & (1 << (pos - 1))) != 0) {
            System.out.println("Bit is 1");
        } else {
            System.out.println("Bit is 0");
        }
    }
    
}
