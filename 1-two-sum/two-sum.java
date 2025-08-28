class Solution {
  public int[] twoSum(int[] nums, int target) {

    // brute
    // will O(n2)
    // check for one element each elements in the array two loops 

    // Space O(n)
    // TIme O(n) + O(n)
    // Value , index
    HashMap<Integer, Integer> preMap = new HashMap<>();
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
      int num =nums[i];
      int moreNeeded=target-num;
      // no need to check for same index same iteattion it will check all 
      // previous entry
      if (preMap.containsKey(moreNeeded)) {
        if (nums[i] < moreNeeded) {
          result[0] = i;
          result[1] = preMap.get(moreNeeded);
        } else {
          result[1] = i;
          result[0] = preMap.get(moreNeeded);
        }
        return result;
      }else{
         preMap.put(nums[i], i);
      }
    }

    return new int[] {-1, -1};
  }
}
