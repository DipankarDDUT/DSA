class Solution {
    public int countConsecutiveOnes(int[] nums){
        int maxLength=0;
        int max=0;
        for(int num:nums){
            if(num==1){
                max++;
            }else{
                maxLength=getMaxLength(maxLength,max);
                max=0;

            }
        }
        // it might hapen after 1100 11111111111111111111111 there was no last 0 encountered to calculate max >maxLength
        return max>maxLength?max:maxLength;
    }
    public int getMaxLength(int max1, int max2){
        return max1>max2?max1:max2;
    }
    public int longestOnes(int[] nums, int k) {

        if(nums.length==0){
            return 0;
        }
          if(k==0){
            return countConsecutiveOnes(nums);
         }
        int maxLength=0;
        int zeroes_count=0;
        int low=0;
        int high=0;
        while(high<nums.length){
            if(nums[high]==0){
                zeroes_count++;
                if(zeroes_count>k){
                    //shrink the window until zeroes_count is equal to k that max flip is allowed

                    while(zeroes_count>k && low<nums.length){
                        if(nums[low]==0){
                            zeroes_count--;
                        }
                        low++;

                    }
                }
               
            }

                maxLength=getMaxLength(maxLength,high-low+1);
                high++;

            }

     

        return maxLength;
    }
}