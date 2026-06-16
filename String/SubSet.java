package String;

import java.util.ArrayList;

public class SubSet {
    public static void main(String[] args) {
        int arr [] ={1,2,3};
        
        System.out.println(subSet(arr));
    }
    public static ArrayList<ArrayList<Integer>> subSet(int [] arr){
        ArrayList <ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : arr){
            int size = outer.size();
            for(int i = 0 ; i < size ;i++){
              ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
              inner.add(num);
              outer.add(inner);
            }
        }
        return outer ;
    }
}
