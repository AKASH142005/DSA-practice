package ArraySorting.CyclicSort;
public class findSingleDuplicateCyclicSort {
    public static void main(String[] args) {
        int[] nums = {1 , 3 ,2 ,5 ,3} ;
        int ans = findDuplicate(nums);
        System.out.print(ans) ;    
    }
    public static int findDuplicate(int[] nums) {
        int i = 0 ;
        while(i < nums.length){
            if(nums[i] != i + 1){
                int correct = nums[i] - 1 ;
                if(nums[i] != nums[correct]){
                    swap(nums , i , correct);
                }
                else {
                    return nums[i] ;
                }
            }
            else {
                i++ ;
            }
        }
        return -1 ;
    }
    public static void swap(int [] nums , int first , int second)
    {
        int temp = nums[first] ;
        nums[first] = nums[second] ;
        nums[second] = temp ;
    }
}
