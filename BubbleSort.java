import java.util.Arrays;
class BubbleSort{
  public static void main(String[] args) {
        int arr[] ={ 5,4 ,3,2,1} ;

       bubble(arr);
       System.out.print(Arrays.toString(arr));
  }
  public static void bubble(int arr []){
    for(int i = 0 ; i < arr.length ; i++){
             boolean Swapped = false ;
        for (int j = 1 ; j < arr.length - i ; j++){
            if(arr[j] < arr[j - 1]){
                int temp = arr[j - 1] ;
                arr[j - 1] = arr [j] ;
                arr[j] = temp ;
                Swapped = true ;
            }
        }
        if(!Swapped){
            break ;
        }
    }
  }
}
