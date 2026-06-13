package recursionArray;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {2 , 4 , 5, 3,22 , 6 , 9};
        int target = 3 ;
        boolean ans = find(arr ,target ,0);
        System.out.println(ans);
        int ans1 = findIndex(arr, target, 0);
         System.out.println(ans1);
        int ans2 = findIndex(arr, target, 0);
         System.out.println(ans2);
    }
    public static boolean find (int [] arr , int target , int index){
        if (index == arr.length ){
        return false;    
        }
        return (arr[index] == target) || find(arr ,target , index + 1);
    }
    public static int findIndex (int [] arr , int target ,int index){
        if(index == arr.length){
            return -1 ;
        }
        if(arr[index] == target ){
            return index ;
        }
        return findIndex(arr,target,index + 1);
    }
    public static int findIndexLast (int [] arr , int target ,int index){
        if(index == -1){
            return -1 ;
        }
        if(arr[index] == target ){
            return index ;
        }
        return findIndex(arr,target,index - 1);
    }
}
