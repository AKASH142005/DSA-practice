class RotatedArray{
  public static void main(String[] args) {
    int nums[] ={ 11 , 12 ,1 ,3 , 5 ,6 };
    int ans = search(nums , 12);
    System.out.println(ans) ;

    int nums2 [] ={2 ,2, 2 ,2 ,9 , 2 ,2};
    int ans2 = findPivot(nums2) ;
    System.out.print(ans2) ;
  }
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums) ;
        int start = 0 ;
        int end = nums.length -1;
        if(pivot == -1){
           return  binarySearch(nums , target , start , end) ;
        }
        if(nums[pivot] == target){
            return pivot ;
        }
        if(nums[start] <= target ){
            return binarySearch(nums , target , start , pivot -1) ;
        }
       return binarySearch(nums , target , pivot + 1 , end) ;
    }

    public static int binarySearch(int [] nums , int target , int start , int end){
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(nums[mid] == target){
                return mid ;
            }
            else if(nums[mid] > target){
                end = mid -1;
            }
            else {
                start = mid + 1 ;
            }
        }
        return -1 ;
    }
    public static int findPivot(int [] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid ;
            }
            if (mid > start && nums[mid] < nums[mid -1]){
                return mid - 1 ;
            }
            if (nums[start] >= nums[mid] ){
                end = mid - 1 ;
            }
            else {
                start = mid + 1 ;
            }
        }
        return -1 ;
    }

  public static int findPivotDuplicate(int [] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid ;
            }
            if (mid > start && nums[mid] < nums[mid -1]){
                return mid - 1 ;
            }
            if (nums[start] == nums[mid] && nums[mid] == nums[end]){
                if(nums[start] > nums [start + 1]){
                  return start ;
                }
                start++ ;
                if(nums [end ] < nums[end -1]){
                  return end -1 ;
                }
                end -- ;
            }
            else if(nums[start] < nums[mid] || nums[mid] == nums[start] && nums[mid] > nums[end]){
               start = mid + 1 ;
            }
            else {
              end = mid - 1 ;
            }
        }
        return -1 ;
    }
}