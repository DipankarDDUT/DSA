class Solution {
  public int subarraySum(int[] nums, int k) {
    int no_of_subArrays = 0;
    if (nums.length == 0) {
      return 0;
    }
    //     Yes \U0001f44d exactly — the main issue is the order of how you are using the HashMap:
    // In your code, you first build the map with all prefix sums (in the first loop).
    // Then in the second loop, you try to check if (sum - k) exists.
    // That breaks the logic because:
    // You only kept the last index of each prefix sum, not all occurrences.
    // Subarrays depend on frequency of prefix sums, not just existence.
    // You’re treating prefix sums as something to precompute once, but the subarray sum check must
    // happen dynamically as you move through the array.
    // That’s why the correct solution updates the map while iterating.
    // sum , index will not help as last occurance of same sum will be stored
    // changin to sum , freq
    HashMap<Integer, Integer> freqMap = new HashMap<>();
    int current_sum = 0;
    // to help with current sum is equal to k itself
    freqMap.put(0, 1);
    for (int i = 0; i < nums.length; i++) {

      current_sum += nums[i];

      // current_sum is x then check x-k exist if
      // yes means k is the diff between it

      int rem = current_sum - k;
      // also current sum -k ==0
      // means current sum is k
      // freqMap.put(0,1); makes this redundant current_sum - k == 0
      no_of_subArrays += freqMap.getOrDefault(rem, 0);
      freqMap.put(current_sum, freqMap.getOrDefault(current_sum, 0)+1);
    }

    return no_of_subArrays;
  }
}
