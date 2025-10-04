class Solution {
    public int singleNumber(int[] nums) {
              if(nums.length==0) return -1;
         // XOR of each will keep the once 
         int XOR=nums[0];
         for(int i=1;i<nums.length;i++){
            XOR^=nums[i];
         }
         return XOR;  
    }
}