public class RotationCount {
  public static void main(String[] args) {
    int nums [] ={4 , 5, 6 ,8 ,2 ,3}; 
    int ans = findRotationCount(nums);
    System.out.println(ans + 1);
  }
  public static int findRotationCount(int nums[]){
      int start = 0 ;
      int end = nums.length -1 ;

      while (start <= end) {
        int mid = start + (end - start )/2 ;

        if(nums[mid] > nums[mid + 1] ){
          return mid ;
        }
        else if(nums[mid - 1] > nums[mid]){
          return mid - 1 ;
        }
        else if(nums[start] >= nums[mid]){
          end = mid + 1 ;
        }
        else {
          start = mid -1 ;
        }

      }
return -1 ;
  }
}
