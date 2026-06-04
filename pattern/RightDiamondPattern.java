package pattern;

public class RightDiamondPattern {
    public static void main(String[] args) {
        int n = 5 ;
        
        for(int i = 1 ;i < n * 2 ; i++){
            int col =(n > i) ? i : 2 * n - i ;
            for (int j = 1 ;j <= col ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
