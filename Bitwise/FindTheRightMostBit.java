package Bitwise;
    class FindTheRightMostBit{
        public static void main(String[] args) {
            int n = 10 ;
            System.out.println(Integer.toBinaryString(n));
            int ans = (n & (-n + 1));
            System.out.println(Integer.toBinaryString(ans));
            System.out.print(getPosition(n));
        }
         public static int getPosition(int n) {
        if (n == 0) return 0;
        return (int)(Math.log(n & -n) / Math.log(2)) + 1;
    }
    }