package pattern;

public class NumberRectangle {
  
    public static void main(String[] args) {
          int n = 4 ;
         int OriginalN = n ;
         int N = 2 * n ;

         for(int row = 1; row < N; row++){
            for(int col = 1 ; col < N ;col++){
                int ArrayValue =OriginalN - Math.min(Math.min(row ,col) ,Math.min(N-row ,N-col)) + 1;
                System.out.print(ArrayValue);
            }
            System.out.println();
         }

    }


    
}
