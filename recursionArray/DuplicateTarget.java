package recursionArray;

import java.util.ArrayList;

public class DuplicateTarget {
    static ArrayList<Integer> list1 = new ArrayList<>() ;
    public static void main(String[] args) {
        int [] arr = {3 ,4 ,4 ,5 ,6 ,7};
         findAllTargetElement(arr, 4, 0);
         System.out.println(list1);

         System.out.println(findAllTargetElement2(arr ,4 ,0 ,new ArrayList<>()));
            System.out.println(findAllTargetElement3(arr,4,0));
    }
    public static void findAllTargetElement(int []arr ,int target ,int index){
        if(arr.length == index){
            return ;
        }
        if(arr[index] == target){
            list1.add(index);
        }
            findAllTargetElement(arr, target, index + 1);
    }
    public static ArrayList <Integer> findAllTargetElement2(int [] arr ,int target ,int index , ArrayList<Integer> list){
        if(arr.length == index){
            return list ;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllTargetElement2(arr, target, index + 1, list) ;
    }

    public static ArrayList<Integer> findAllTargetElement3(int [] arr ,int target ,int index ){
      ArrayList<Integer> list = new ArrayList<>() ;
        if(arr.length == index){
            return list ;
        }
    
       if(target == arr[index]){
        list.add(index);
       }
       ArrayList<Integer> previousReturnElement = findAllTargetElement3(arr, target, index + 1) ;
       list.addAll(previousReturnElement);
        return list ;
    }
}

