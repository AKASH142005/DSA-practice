package ArraySorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr [] = {3,4 ,34 , 6 ,7,5 ,1};
        int arr1 [] = mergeSort(arr) ;
        System.out.print(Arrays.toString(arr1));

    }
    public static int [] mergeSort(int [] arr ){
        if(arr.length == 1){
            return arr ;
        }

      
        int mid = arr.length/2;
        int [] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int [] right =mergeSort(Arrays.copyOfRange(arr, mid , arr.length)) ;

        return merge(left , right);
    }
    private static int[] merge(int[] left, int[] right) {
        int arr[] = new int[left.length + right.length];

        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        while(left.length > i && right.length > j){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++ ;
        }
        while (i < left.length) {
            arr[k] = left[i] ;
            i++;
            k++;
        }
         while (j < right.length) {
            arr[k] = right[j] ;
            j++;
            k++;
        }
        return arr ;
    }
}
