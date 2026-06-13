package recursionArray;

public class SorteedArray {
    public static void main(String[] args) {
        int [] arr = {3 ,4 ,6 , 8};
        System.out.println(checkSorted(arr, 0));
    }
    public static boolean checkSorted(int [] arr , int i){
        if(arr.length -1 == i){
            return true ;
        }
        if(arr[i]>arr[i +1]){
            return false ;
        }
        return (arr[i]<arr[i+1]) && checkSorted(arr, i + 1) ;
    }
}
