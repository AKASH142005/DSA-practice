public class armstrong {
  public static void main(String [] args){
    boolean result = armstrongNumber(153);
    System.out.print(result);
  }
  static boolean armstrongNumber(int original){
    int sum = 0;
    int n = original ;
    while(n > 0){
      int rem = n % 10;
      sum = sum + rem*rem*rem ;
      n /= 10;
    }
    return sum == original;
  }
}
