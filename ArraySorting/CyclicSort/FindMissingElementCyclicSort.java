package ArraySorting.CyclicSort;
import java.util.ArrayList;
import java.util.List;

public class FindMissingElementCyclicSort {
    public static void main(String[] args) {
        int [] nums = {5 ,2 ,1 ,2 ,3 ,6 ,7 ,5} ;
        List <Integer> ans = findDisappearedNumbers(nums) ;
        System.out.print(ans);

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0 ;
        while(i < nums.length){
            int correct = nums[i] - 1 ;
            if(nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums , i , correct) ;
            }
            else{
                i++ ;
            }
        }

            List<Integer> ans =new ArrayList<>();
        for(int j =0 ;j < nums.length ;j++){
            if(nums[j] != j + 1){
                ans.add(j + 1);
            }
        }
        return ans ;
    }
    public static void swap(int [] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second] ;
        arr[second] = temp ;
    }

}
