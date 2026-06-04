package pattern;

public class NumeberMountain {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 2 * n; i++) {

            int col = i <= n ? i: 2* n - i;
            int spaces = i <= n ? n - i: i - n ;
            for (int s = 1 ; s <= spaces ; s++) {
                System.out.print("  ");
            }
            for (int j = col; j >= 1; j--) {
                System.out.print(j +" ");
            }
            for(int k = 2 ; k <= col ; k++)
            System.out.print(k +" ");
         System.out.println();
        }
       
    }
}

