package ArraySorting;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr ={ 3 , 1 ,2 ,5} ;
        Selection(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void Selection(int arr []){
        for(int i = 0 ;i < arr.length ;i++){
            int last = arr.length - i - 1 ;
            int max = getMaxIndex(arr , 0 , last);
            swap(arr ,max ,last) ;
        }
  
    }
    public static int getMaxIndex(int [] arr, int start , int last){
        int max = start ;
        for(int i = start ; i <= last ; i++){
            if(arr[max] < arr[i]){
                max = i ;
            }
        }
        return max ;
    }

    public static void swap(int [] arr , int max ,int last){
            int temp = arr[last] ;
            arr[last] = arr[max] ;
            arr[max] = temp ;
    }
}
