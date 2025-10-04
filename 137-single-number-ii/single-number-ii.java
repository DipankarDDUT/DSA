class Solution {
  public int singleNumber(int[] nums) {
    if (nums.length == 0) return -1;
    // concepts of bucket
    int ones = 0; // all number appearing once
    int twos = 0; // all number appearing twice

    for (int i = 0; i < nums.length; i++) {
      // suppose two as 1 01 then again 1 came
      // one has 1 2 3 now again 1 came it will remove 1 from 1
      ones = (ones ^ nums[i]) & ~twos;
      // negation is to not to push to one if already
      // exist in ones
      twos = (twos ^ nums[i]) & ~ones;
    }

    return ones;
  }
}
