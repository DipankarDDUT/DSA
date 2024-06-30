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

            // Best Approach , next we will see optimal 
            // time complexity is O(n) but space complexity incresed
            //  form O(1) to O(2n)
            // we will get rid of inner loop to calculate left max and right max 
            // use prefix max and suffix max
        //     int max=0;
        //     int[] prefix=new int[height.length];
        //     int[] suffix=new int[height.length];
        //     for(int i=0;i<height.length;i++){
        //         if(height[i]>max){
        //             max=height[i];
        //         }
        //         prefix[i]=max;
        //     }
        //     max=0;
        //        for(int i=height.length-1;i>=0;i--){
        //         if(height[i]>max){
        //             max=height[i];
        //         }
        //         suffix[i]=max;
        //     }
        //    int result=0;
        // for(int i=1;i<height.length-1;i++){
        
        //     int leftMostHeight=prefix[i];
        //     int rightMostHeight=suffix[i];
        //     int tempHeight=Math.min(leftMostHeight,rightMostHeight)-height[i];
        //     if(tempHeight>0){
        //         result+=tempHeight;
        //     }
        // }

        // return result;


        // optimal with O(n) and O(1)
        int leftmost=0;  // leftmost highest value
        int rightmost=0;
        int l=0;
        int r=height.length-1;
        int result=0;
        while(l<=r){
            if(height[l]<=height[r]){
                // left is smaller
                if(leftmost<height[l]){
                   leftmost=height[l];
                }else{
                    result=result+leftmost-height[l];
                    
                }
                l++;
            }else{
                // right is smaller
                  if(rightmost<height[r]){
                  
                    rightmost=height[r];
                }else{
                    result=result+rightmost-height[r];
                }
                r--;;
            }
        }

        return result;
    }
}