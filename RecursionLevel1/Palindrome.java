package RecursionLevel1;

public class Palindrome {
    public static void main(String[] args) {
        Reverse rev = new Reverse() ;
        int n =3473;
        int reverse = rev.rev2(n) ;
        if(reverse == n){
            System.out.println("Palindrome");
        }
    }
}
