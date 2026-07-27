import java.util.Arrays;

public class Trapping {
     public int trap(int[] height) {
        int n = height.length;
        int [] leftMax =new int[n];
        int [] rightMax = new int[n];
        int sum = 0 ;
        System.out.println(Arrays.toString(height));

        for(int i = 0 ; i < n ; i++){
            if(i == 0){
                leftMax[i] = height[i];
                rightMax[n - i - 1] = height[n - i - 1];
            } else {
                  leftMax[i] = Math.max(height[i] , leftMax[i - 1]);
                  rightMax[n - i - 1] = Math.max(height[n - i - 1] , rightMax[n - i]);
            }
        }

        System.out.println(Arrays.toString(leftMax));
        
        System.out.println(Arrays.toString(rightMax));


        for(int i = 0 ; i < n ; i++){
            int container = Math.min(leftMax[i] ,rightMax[i]);
            if(container > height[i]){
                sum += container - height[i];
            }
        }
        return sum ;
    }

    public static void main(String[] args) {
        Trapping trapping = new Trapping() ;
        int sum = trapping.trap(new int []{0,1,0,2,1,0,1,3,2,1,2,1});
        int sum1= trapping.trap(new int []{4,2,0,3,2,5});
        
        System.out.println(sum1);
        System.out.println(sum);
    }
}
