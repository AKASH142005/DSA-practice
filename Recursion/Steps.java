package Recursion;
class Steps{
    public static void main(String[] args) {
        int n = 123 ;
        int ans =steps(n, 0);
        System.out.println(ans);
    }
    public static int steps(int n ,int count){
        if(n == 0){
            return count ;
        }
        if((n & 1) == 0){
            return steps(n/2, ++count);
        }
        return steps(n - 1, ++count);
    }
}