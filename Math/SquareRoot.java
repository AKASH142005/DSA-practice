package Math;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 40 ;
        double ans = squareRootBinarySearch(n); 
        System.out.print(ans);
    }
    public static double squareRootBinarySearch(int n){
        int s = 0;
        int e = n ;
        double root = 0.0 ;
        int p = 3 ;

        while (s <= e){
            int m = s +(e-s)/2 ;
            if(m*m == n){
                return m ;
            }
            if (m*m < n){
                s = m + 1 ;
            } else {
                e = m - 1 ;
            }
        }
         root = e ;
         double incr = 0.1 ;
         for(int i = 0 ; i < p ;i++){
            while(root*root < n){
                root += incr ;
            }
            root -= incr ;
            incr /= 10 ;
         }
         return root ;
    }
}
