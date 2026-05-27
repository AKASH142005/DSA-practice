public class LinearSearchInString {
      public static void main(String [] args)
      {
          String s ="Akash";
          
          int result  = search(s , 'k');

          boolean result1 = search2(s , 'g') ;

          System.out.println(result);
          System.out.println(result1 );
      }

      static boolean search2(String s ,char target ){
          if (s.length() == -1) {
            return false ;
          }
          for(char i : s.toCharArray()){
            if(target == i){
              return true;
            }
          }

        return false;
      }
      static int search(String s , char target){
        if (s.length() == -1){
          return -1 ;
        }

        for(int i = 0 ;i < s.length() -1 ;i++){
            if(s.charAt(i) == target){
              return i ;
            }
        }
      return -1;
      }
}
