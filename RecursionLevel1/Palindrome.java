package RecursionLevel1;

public class Palindrome {
    public static void main(String[] args) {
        int n =343;
        int reverse = Reverse.rev2(n) ;
        if(reverse == n){
            System.out.println("Palindrome");
        }
    }
}
