class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        

        int max_ones=0;
        int cur=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cur++;
            }else{
                max_ones=Math.max(cur,max_ones);
                // whatever either bigger or not 0 means cur get reset
                cur=0;

            }
        }

        // use case max ones last part of the array without any ending 0 iteration
        // ends with 1 and consecutive 1's without any 0 

        if(cur>0 && cur>max_ones){
            return cur;
        }

        return max_ones;
    }
}