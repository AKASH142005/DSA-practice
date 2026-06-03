public class StringComparison {
    public static void main(String[] args) {
        String s = "akash";
        String s1 = "akash"; 
        
        System.out.println(s == s1);

        String s2 = new String("akash");
        String s3 = new String("akash");

        System.out.println(s2 == s3);
    }
    
}
