class Solution {
  public int[] searchRange(int[] nums, int target) {

    // iteration
    int firstOccurrence = getFirstOccurrence(nums, target);

    if (firstOccurrence == -1) {
      return new int[] {-1, -1};
    }
    // if there is no occurrence itself means no number

    int lastOccurrence = getLastOccurrence(nums, target);

    return new int[] {firstOccurrence, lastOccurrence};
  }

  public int getFirstOccurrence(int[] nums, int target) {
    int high = nums.length - 1;
    int low = 0;
    int ans = -1;
    while (high >= low) {
      int mid = low + ((high - low) / 2);
      if (nums[mid] == target) {
        ans = mid;
        high = mid - 1;
      } else if (nums[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return ans;
  }

  public int getLastOccurrence(int[] nums, int target) {
    int high = nums.length - 1;
    int low = 0;
    int ans = -1;
    while (high >= low) {
      int mid = low + ((high - low) / 2);
      if (nums[mid] == target) {
        ans = mid;
        // go to next element to find more last occurrences
        low = mid + 1;
      } else if (nums[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return ans;
  }
}
