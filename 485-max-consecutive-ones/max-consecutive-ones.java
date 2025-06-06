class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int longest=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
              if(nums[i]!=1){
               longest=Math.max(longest,count);
                count=0;
              } else{
                count++;
              } 
        }

            // for last cosecutive 1s
          longest=Math.max(longest,count);

        return longest;
    }
}