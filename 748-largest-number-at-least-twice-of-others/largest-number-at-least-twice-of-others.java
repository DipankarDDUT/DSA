class Solution {
    public int dominantIndex(int[] nums) {
        int largest=0;
        int index=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>=largest){
                largest=nums[i];
                index=i;
            }
        }

        for(int num:nums){
            if(num==largest){
                continue;
            }
            if(largest<2*num){
                return -1;
            }
        }


        return index;
    }
}