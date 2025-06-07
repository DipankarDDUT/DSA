class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int longest=0;
        int cur=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                longest=Math.max(cur,longest);
                cur=0;
            }else{
                cur++;
            }
        }
            // longest at the end with no zero and ts ends
          longest=Math.max(cur,longest);

          return longest;
    }
}