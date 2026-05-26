import java.util.Scanner;
public class Calculator {
  public static void main (String[] args){
      Scanner in = new Scanner(System.in);

      while(true) {
        System.out.print("Enter the operator : ");
        char op = in.next().trim().charAt(0);

        System.out.print("Enter the two numbers : ");
        int a = in.nextInt() ;
        int b = in.nextInt() ;
        int ans =0;

        if(op == '-' || op =='+' || op == '/' || op == '*' || op == '%' ) {
          if(op =='+'){
            ans =a + b ;
          }
          else if(op =='-'){
            ans = a - b ;
          }
          else if(op =='*'){
            ans = a * b;
          }
          else if (op == '/'){
            ans =  a / b;
          }
          else if (op == '%'){
            ans = a % b;
          }
        }
        else if( op == 'X' || op == 'x') {
          break ;
        }
        else 
          System.out.print("Invalid Input !!");

      System.out.println(ans);
      }
  in.close();
  }
  
}