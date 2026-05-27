public class LinearSearch{
    public static void main (String [] args ){

        int arr [] ={3 ,4 ,5 ,64 ,32};
        int result = search(arr, 32);
        System.out.println(result) ;

        System.out.println(search2(arr ,2));

        System.out.println(searchRange(arr , 3 ,1 ,3));
    }

    static int searchRange(int[] arr ,int target ,int start , int end){
       if (arr.length == -1){
          return -1 ;
        }
         for (int i = start ; i < end ; i++ ){
            if(arr[i] == target){
              return i ;
            }
         } 
      return -1;
    }
    static int search(int[] arr ,int target){
        if (arr.length == -1){
          return -1 ;
        }
         for (int i = 0 ; i < arr.length ; i++ ){
            if(arr[i] == target){
              return i ;
            }
         } 
      return -1;
    }

    static boolean search2(int arr[] , int target){
        if(arr.length == -1){
          return false ;
        }
        for (int i = 0 ;i < arr.length ; i++){
            if(arr[i] == target){
              return true ;
            }
        }
        return false ;
    }
}