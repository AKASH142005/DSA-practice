public class Ceiling {
  public static void main(String[] args) {
        int arr[] = {2 , 3, 4, 7 , 12 ,23};

        System.out.print(ceiling(arr, 7));
  }
  public static int ceiling(int [] arr ,int target){
        int start = 0 ;
        int end = arr.length - 1 ;

    while(start <= end){
        int mid = start + (end - start)/2;
        if(target > arr[arr.length -1]){
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
    return start ;
  }
}
