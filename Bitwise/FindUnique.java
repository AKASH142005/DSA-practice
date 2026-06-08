package Bitwise;

public class FindUnique {
    
    public static void main(String[] args) {
        int [] arr ={ 2 ,2 ,3,3 ,4 ,4 ,5 };
        System.out.print(findUnique(arr));
    }

    public static int findUnique(int [] arr){
        int unique = 0;
        for(int num :arr){
            unique ^= num ;
        }
        return unique ;
    }
}
