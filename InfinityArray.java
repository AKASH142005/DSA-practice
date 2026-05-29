class InfiniteArray{
  public static void main(String[] args) {
    int arr[] ={3 , 5 , 7 ,  8 , 10 ,12  ,15} ;

    int ans = searchRange(arr , 12);
    System.out.print(ans) ;
  }
  public static int searchRange(int [] arr ,int target){
      int index = -1 ;
      int start = 0 ;
      int end = 1 ;

      while(target > arr[end]){
          int temp = end + 1 ;
          end = end + ((end - start ) + 1) * 2 ; 
          start = temp ;
      }

    index = binarySearch(arr , target , start , end);
    return index ;
  }
  public static int binarySearch(int [] arr ,int target , int start ,int end){
   while(start <= end){
    int mid = start + (end - start)/2 ;
      if(target == arr[mid]){
        return mid ;
      }
      else if(target < arr[mid]){
         end = mid - 1 ;
      }
      else{
         start = mid + 1 ;
      }
   }
   return -1 ;
  }
}