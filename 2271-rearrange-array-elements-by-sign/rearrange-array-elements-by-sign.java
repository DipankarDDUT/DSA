class Solution {
  public int[] rearrangeArray(int[] nums) {

    int[] evenArray = new int[nums.length / 2];
    int[] oddArray = new int[nums.length / 2];

    int minusIndex = 0;
    int plusIndex = 0;
    for (int i=0;i<nums.length; i++) {
      if (nums[i]> 0) {
        evenArray[plusIndex++] = nums[i];
      } else {
        oddArray[minusIndex++] = nums[i];
      }
    }
    minusIndex = 0;
    plusIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i % 2 == 0) {
        nums[i] = evenArray[plusIndex];
        plusIndex=plusIndex+1;
      } else {
        nums[i] = oddArray[minusIndex];
        minusIndex=minusIndex+1;
      }
    }

    return nums;
  }
}
