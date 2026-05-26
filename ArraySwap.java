import java.util.Arrays;
public class ArraySwap {
  public static void main (String [] args){
    ArraySwap obj = new ArraySwap();
      int[] arr = {1,2,5,6,7,0}; 
     obj.swap(arr,1,4);
      System.out.println(Arrays.toString(arr));


  }

  public void swap(int[] arr ,int index1 ,  int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
  }
}
