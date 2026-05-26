public class ArrayMax {
  public static void main(String[] args) {
    int [] arr ={34,4,39,53,42};

    System.out.println(max(arr));

    System.out.println(maxRange(arr , 2, 3));
  }
  public static int max(int [] arr){
      int max = arr[0];
      for(int i=0 ;i< arr.length ;i++){
          if(max < arr[i]){
            max = arr[i];
          }
      }
      return max;
  }

  public static int maxRange(int[] arr , int start ,int end){
    // edge case statement for control the error
      if(start > end){
        return -1 ;
      }

      if(arr == null){
        return -1 ;
      }
      int max = arr[start];

      for(int i = start ;i < end ; i++ ){
        if(max < arr[i]){
          max = arr[i];
        }
      }

    return max;
  }

}
