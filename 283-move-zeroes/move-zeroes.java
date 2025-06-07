class Solution {
    public void moveZeroes(int[] nums) {
        
        int nonZero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonZero++]=nums[i];      
            }
        }

        // other left make it 0 
        while(nonZero<nums.length){
            nums[nonZero++]=0;
        }
    }
}