public class EvenDigit {
  public static void main(String[] args) {
     int[] nums = {12,345,2,6,7896} ;

     int count =findNumbers(nums);

     System.out.print(count);
  }
    public static int findNumbers(int[] nums) {
        int count1 = 0 ;
         for(int num = 0 ;num < nums.length ; num++){
            if(count(nums[num]) % 2 == 0){
                count1++ ;
            }
        }
        return count1;
    }
    public static int count (int num){
      if(num < 0){
        num *= -1;
      }
      if(num == 0){
        return 1;
      }
        int count = 0;
       while(num != 0){
            num /= 10 ;
            count++;
       }
    return count ;
    }
}

