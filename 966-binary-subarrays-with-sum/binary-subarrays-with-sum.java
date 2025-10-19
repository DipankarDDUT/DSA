class Solution {

  public int atMost(int[] nums, int goal) {
        // all valid substring smaller or equal to goal
        if(goal<0) return 0;
        int sum=0;
        int l=0;
        int result=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>goal){
                // any sum smaller than goal  or equal stop 
                sum-=nums[l++];
            }
            // all previous l to r valid substring as sum<goal
            result+=r-l+1;
        }
        return result;
  }

  public int numSubarraysWithSum(int[] nums, int goal) {

    return atMost(nums,goal) - atMost(nums,goal-1);
  }
}
