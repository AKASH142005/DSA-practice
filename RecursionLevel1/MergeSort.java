package RecursionLevel1;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
          int arr [] = {3,4 ,34 , 6 ,7,5 ,1};
         mergeSort(arr , 0 , arr.length) ;
        System.out.print(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr ,int s ,int e) {
       if((e -s) == 1){
        return ;
       }
       int m = s + (e - s)/2 ;
       mergeSort(arr, s, m);
       mergeSort(arr, m, e);

       merge(arr,s,m,e);
    }
    public static void merge(int [] arr ,int s ,int m ,int e){
        int [] mix = new int[e -s];

        int i = s ;
        int j = m ;
        int k = 0;
        while(i < m && j < e){
            if(arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++ ;
            }
            else {
                mix[k] = arr[j];
                j++ ;
            }
            k++ ;
        }

        while(i < m){
            mix[k] = arr[i];
            i++ ;
            k++ ;
        }
        while(j < e){
            mix[k] = arr[j] ;
            j++ ;
            k++ ;
        }

        for(int l = 0 ; l < mix.length ; l++){
            arr[s + l] = mix[l] ;
        }
    }
}
