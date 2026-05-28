public class Floor {
  public static void main(String[] args) {
        int arr[] = {4, 7 , 12 ,23 , 64};

        System.out.print(floor(arr, 2));
  }
  public static int floor(int [] arr ,int target){
        int start = 0 ;
        int end = arr.length - 1 ;

    while(start <= end){
        int mid = start + (end - start)/2;
        if(target < arr[0]){
            return -1 ;
        }
        if(target == arr[mid]){
            return mid;
        }
        if(arr[mid] > target){
            end = mid -1;
        } else {
            start = mid + 1 ;
        }
    }
    return end ;
  }
}

