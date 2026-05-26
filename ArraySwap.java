import java.util.Arrays;
public class ArraySwap {
  public static void main (String [] args){
    ArraySwap obj = new ArraySwap();
      int[] arr = {1,2,5,6,7,0}; 
      int[] arr2 = {1,2,5,6,7,0}; 
     obj.swap(arr,1,4);
      System.out.println(Arrays.toString(arr));
    reverse(arr2);
      System.out.println(Arrays.toString(arr2));
  }
  public static void reverse(int[] arr){
      int start = 0 ;
      int end = arr.length -1;
      while(start < end){
          int temp = arr[start] ;
          arr[start] = arr[end] ;
          arr[end] = temp ;
        
        start++;
        end--;
      }
  }

  public void swap(int[] arr ,int index1 ,  int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
  }
}
