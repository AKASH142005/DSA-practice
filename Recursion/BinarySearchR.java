package Recursion;

public class BinarySearchR {
    public static void main(String[] args) {
        int []arr ={3 ,4 ,5, 6, 7 ,45};
        System.out.print(binarySearch(arr, 45, 0, arr.length -1));
    }
    public static int binarySearch(int [] arr ,int target ,int s,int e){
        if(s > e){
            return -1 ;
        }
        int mid = s +(e-s)/2;
        if(arr[mid] == target){
            return mid ;
        }
        if (arr[mid] < target){
           return binarySearch(arr, target, mid + 1, e);
        }
        return binarySearch(arr, target, s, mid - 1);
    }
}
