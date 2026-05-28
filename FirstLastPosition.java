import java.util.*;
public class FirstLastPosition{
  public static void main(String[] args) {
    int[] nums = {5,7,7,8,8,10};
    FirstLastPosition obj = new FirstLastPosition();
    int [] ans = obj.searchRange(nums , 7);
    System.out.println(Arrays.toString(ans));
  }
    public int[] searchRange(int[] nums, int target) {
      int[] ans = {-1 , -1};
        ans[0] = search(nums , target , true);
        if(ans[0] != -1){
          ans[1] = search(nums , target , false);
        }
        return ans ;
   }

  public int search(int [] nums ,int target , boolean findStartIndex){
    int ans = -1 ;

    int start = 0 ;
    int end = nums.length -1;
    
      while(start <= end){
            int mid = start + (end - start)/2 ;
          if(nums[mid] > target){
          end = mid - 1 ;
          }
          else if(nums[mid] < target){
             start = mid + 1;
          }
          else {
            ans = mid;
            if(findStartIndex){
                end = mid - 1 ;
            } else {
                start = mid + 1 ;
            }
          }
      }
    return ans ;
  }
}