public class OrderAgnosticBS {
  public static void main(String[] args) {
    int [] arr ={-5, -4,-2 ,2 ,3 ,4 ,5 ,7 ,23 , 34 ,46 };

    int [] arr1 ={10 , 8 , 5 , 3 , 2};
    System.out.println(orderAgnosticBS(arr , 46));

    System.out.println(orderAgnosticBS(arr1, 0));
  }

  public static int orderAgnosticBS(int [] arr ,int target){

      int start = 0 ;
      int end = arr.length -1;
      boolean isAsc = arr[0] < arr[arr.length -1];  

      while (start <= end){
        int mid = start + (end - start)/2 ;

        if(target == arr[mid]){
          return mid;
        }

        if(isAsc){
          if(arr[mid] > target){
              end = mid -1 ;
          }
          else {
              start = mid + 1;
          }
        }
        else {
          if(arr[mid] < target){
            end = mid -1 ;
          }
          else {
            start = mid + 1;
          }
        }

      }
      return -1 ;
  }
}
