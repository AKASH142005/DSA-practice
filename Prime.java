import java.util.Scanner;
public class Prime {
  public static void main (String [] args){
    Scanner in = new Scanner (System.in);
    System.out.println("Enter the Number :");
     int input = in.nextInt() ;
    Prime obj = new Prime();
  

    for (int i = 2 ;i < input ; i++){
       boolean result = obj.primeNumber(i) ;
       if (result) System.out.print(i +" ");
    }
    in.close();
  }

  boolean primeNumber(int num){
    int c =2;
    if(num <=0){
      return false ;
    }
    while(c*c <= num){
      if(num % c == 0){
        return false ;
      }
      c++;
    }
    return true ;
  }
}
