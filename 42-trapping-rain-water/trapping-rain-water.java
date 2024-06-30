import java.util.*;
class Solution {
    public int trap(int[] height) {
        

        // Brute force O(n2)
        // brute for each index max height left and max height right 
        //get the minimum and minus the height of the indez gives the ans

        // int result=0;
        // for(int i=1;i<height.length-1;i++){
        //     // leftmost and rightmost we can ignore for calculation but not 
        //     // for comparison as leftmost and rightmost can not fill any water
        //     int leftMostHeight=0;
        //     int rightMostHeight=0;
        //     int j=0;
        //     while(j<i){
        //         if(height[j]>leftMostHeight){
        //             leftMostHeight=height[j];
        //         }
        //         j++;
        //     }
        //     j=i+1;
        //       while(j<height.length){
        //         if(height[j]>rightMostHeight){
        //             rightMostHeight=height[j];
        //         }
        //         j++;
        //     }
        //     int tempHeight=Math.min(leftMostHeight,rightMostHeight)-height[i];
        //     if(tempHeight>0){
        //         result+=tempHeight;
        //     }
        // }

        // return result;

            // optimal 
            // we will get rid of inner loop to calculate left max and right max 
            // use prefix max and suffix max
            int max=0;
            int[] prefix=new int[height.length];
            int[] suffix=new int[height.length];
            for(int i=0;i<height.length;i++){
                if(height[i]>max){
                    max=height[i];
                }
                prefix[i]=max;
            }
            max=0;
               for(int i=height.length-1;i>=0;i--){
                if(height[i]>max){
                    max=height[i];
                }
                suffix[i]=max;
            }
           int result=0;
        for(int i=1;i<height.length-1;i++){
        
            int leftMostHeight=prefix[i];
            int rightMostHeight=suffix[i];
            int tempHeight=Math.min(leftMostHeight,rightMostHeight)-height[i];
            if(tempHeight>0){
                result+=tempHeight;
            }
        }

        return result;

    }
}