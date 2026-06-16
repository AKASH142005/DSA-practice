package StringRecusion;

import java.util.ArrayList;

public class DuplicateSubSet {
    public static void main(String[] args) {
        int arr [] ={1,2,2,2,3};
        
        System.out.println(subSetDuplicate(arr));
    }
    public static ArrayList<ArrayList<Integer>> subSetDuplicate(int [] arr){
        ArrayList <ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0 ;
        int end = 0 ;
        for(int i= 0 ; i < arr.length ; i++){
            start = 0 ;
            if(i > 0 && arr[i - 1] == arr[i]){
                start = end + 1;
            }
            end = outer.size() - 1; 
            int size = outer.size();
            for(int j = start ; j < size ;j++){
              ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
              inner.add(arr[i]);
              outer.add(inner);
            }
        }
        return outer ;
    }
    
}
