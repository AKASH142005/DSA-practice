import java.util.Arrays;

public class WellsortedArray2D {
  public static void main(String[] args) {
      int [][] arr = {
        {10 ,20 ,30 ,40} ,
         {12 ,22 ,33 ,44} ,
          {16 ,25 ,36 ,46} ,
           {18 ,28 ,39 ,50}
      } ;
      int ans[] =search(arr, 28) ;

      System.out.println(Arrays.toString(ans));
  }
  public static int [] search(int [][] arr , int target){
      int row = 0 ;
      int col = arr.length -1 ;
      while(row < arr.length && col >= 0){

        if(arr[row][col] == target){
            return new int [] {row ,col} ;
        }
        if (arr [row][col] > target){
          col-- ;
        }
        else{
          row++ ;
        }
      }
      return new int [] {-1 ,-1} ;
  }
  
}