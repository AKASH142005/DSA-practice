package recursionArray;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr ={3 , 10 ,2, 6 ,7 , 1 ,9, 8} ;
        selectiveSort (arr, arr.length, 0 , 0);
        System.out.print(Arrays.toString(arr));
    }
    public static void selectiveSort(int [] arr ,int r ,int c ,int max){
        if(r == 0){
            return ;
        }
        if(c < r){
            if(arr[c] > arr[max] ){
               selectiveSort(arr, r, c + 1, c);
            }
            else {
              selectiveSort(arr, r, c + 1, max);
            }
        }
        else {
            int temp = arr[max] ;
            arr[max] = arr[r - 1] ;
            arr[r - 1] = temp ;
            selectiveSort(arr, r - 1, 0, 0);
        }
    }
}
