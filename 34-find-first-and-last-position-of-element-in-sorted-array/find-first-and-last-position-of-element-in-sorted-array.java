class Solution {
  public int[] searchRange(int[] nums, int target) {

    // iteration
    int firstOccurance = getFirstOccurrence(nums,0,nums.length-1,target,-1);


    int lastOccurrence = getLastOccurrence(nums,0,nums.length-1,target,-1);


    return new int[] {firstOccurance, lastOccurrence};
  }

   public int getFirstOccurrence(int[] nums, int low, int high, int target, int ans) {
    if (high >= low) {
      int mid = low + ((high - low) / 2);
      if (nums[mid] == target) {
        ans = mid;
        // go to previous element to find more first occurrences
        return getFirstOccurrence(nums, low, mid - 1, target, ans);
      } else if (nums[mid] < target) {
        return getFirstOccurrence(nums, mid + 1, high, target, ans);
      } else {
        return getFirstOccurrence(nums, low, mid - 1, target, ans);
      }
    }

    return ans;
  }

     public int getLastOccurrence(int[] nums, int low, int high, int target, int ans) {
    if (high >= low) {
      int mid = low + ((high - low) / 2);
      if (nums[mid] == target) {
        ans = mid;
        // go to previous element to find more last occurrences
       return getLastOccurrence(nums, mid + 1, high, target, ans);
      } else if (nums[mid] < target) {
        return getLastOccurrence(nums, mid + 1, high, target, ans);
      } else {
        return getLastOccurrence(nums, low, mid - 1, target, ans);
      }
    }

    return ans;
  }
}
