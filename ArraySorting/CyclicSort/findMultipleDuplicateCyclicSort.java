package ArraySorting.CyclicSort;
import java.util.ArrayList;
import java.util.List;

public class findMultipleDuplicateCyclicSort {
    public static void main(String[] args) {
        int [] nums = { 2 , 3, 6 , 1, 2 ,3 } ;
        List <Integer> ans = findDuplicates(nums) ;
        System.out.print(ans) ;

    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>() ;
        int i = 0 ;
        while(i < nums.length){
                int correct = nums[i] - 1 ;
                if(nums[i] != nums[correct]){
                    swap(nums , i , correct);
                }
                else {
                   i++ ;
                }
        }
        for(int j = 0 ; j < nums.length ; j++){
             if(nums[j] != j + 1){
                ans.add(nums[j]);
        }
               
        }
        return ans;
    }
    public static void swap(int [] nums , int first , int second)
    {
        int temp = nums[first] ;
        nums[first] = nums[second] ;
        nums[second] = temp ;
    }

}
