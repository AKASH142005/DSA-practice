package recursionArray;

public class RBS {
    public static void main(String[] args) {
        int arr [] ={7 , 10 ,12, 3 ,4 ,5 ,6};
        System.out.println(binarySearch(arr, 7, 0, arr.length -1 ));
    }
    public static int binarySearch(int [] arr ,int target ,int s ,int e){
        if (e < s){
            return -1 ;
        }
          int mid = s + (e - s)/2 ;
        if(arr[mid] == target){
            return mid ;
        }
        if(arr[s] <= arr[mid] ){
            if(arr[s] <= target && arr[mid] >= target){
                return binarySearch(arr, target, s, mid - 1);
            } else {
                return binarySearch(arr, target, mid + 1, e);    
            }
        }
        if(arr[mid] <= target && arr[e] >= target){
            return binarySearch(arr, target, mid + 1, e);
        }
        return binarySearch(arr, target, s, mid - 1);
    }
}
