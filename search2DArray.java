import java.util.Arrays;
public class search2DArray {
  public static void main(String[] args) {
        int [][] arr ={
          {3 ,43 ,33 ,42 ,19} , 
          {2 , 23 ,12 ,23} ,
          {45 , 15}
        };

        int ans[] = search2D(arr , 15);

        System.out.println(Arrays.toString(ans));
  }
  public static int[] search2D(int [][] arr , int target){
    if(arr.length == -1){
        return new int [] {-1 ,-1};
    }
    for(int row = 0 ;row < arr.length ; row++){
      for(int col =0 ;col < arr[row].length ; col++){
          if(arr[row][col] == target){
            return new int[] {row ,col};
          }
      }
    }
    return  new int[] {-1 , -1};
  }
}
