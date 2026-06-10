package Bitwise;
import java.util.Arrays ;
public class FipAndInvertImage {
    public static void main(String[] args) {
        int [][] arr = {
            {0,1,0},{1,1,0},{1,0,1}
        } ;
        for(int arr1 []:arr){
        System.out.print(Arrays.toString(arr1));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int arr []:image){
            for(int i =0 ; i <(arr.length +1)/2 ;i++){
               int temp  = arr[i]^1 ;
              arr[i] = arr[arr.length - i -1] ^ 1;
              arr[arr.length - i -1] = temp ;
            }
        }
        return image ;
    }

}
