class Solution {
  public boolean canJump(int[] nums) {

    // if number = 0 then only there is possibility we can't reach

    // max index that can be reached
    int maxIndex = 0;

    for (int i = 0; i < nums.length; i++) {
      int sum = nums[i] + i; // max it can reach from its place
       /* If the current index 
               is greater than the 
               maximum reachable index
               it means we cannot move 
               forward and should 
               return false */
      if (maxIndex < i) return false;
                  /* Update the maximum index that can be 
               reached by comparing
               the current maxIndex with the sum 
               of the current index and
               the maximum jump from that index */
      maxIndex = Math.max(sum, maxIndex);
    }

    return true;
  }
}
