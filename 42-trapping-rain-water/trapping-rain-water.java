import java.util.*;
class Solution {
    public int trap(int[] height) {
        

        // Brute force O(n2)
        // brute for each index max height left and max height right 
        //get the minimum and minus the height of the indez gives the ans

        int result=0;
        for(int i=1;i<height.length-1;i++){
            // leftmost and rightmost we can ignore for calculation but not 
            // for comparison as leftmost and rightmost can not fill any water
            int leftMostHeight=0;
            int rightMostHeight=0;
            int j=0;
            while(j<i){
                if(height[j]>leftMostHeight){
                    leftMostHeight=height[j];
                }
                j++;
            }
            j=i+1;
              while(j<height.length){
                if(height[j]>rightMostHeight){
                    rightMostHeight=height[j];
                }
                j++;
            }
            int tempHeight=Math.min(leftMostHeight,rightMostHeight)-height[i];
            if(tempHeight>0){
                result+=tempHeight;
            }
        }

        return result;

    }
}