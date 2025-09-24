class Solution {
    public int findMin(int[] nums) {

    // Optimal
    // check for the sorted section and ge tthe min
    // and check and update
    // go to unsorted section and repeat

    int low = 0;
    int high = nums.length - 1;
    int min = Integer.MAX_VALUE;

    // as distinct no need to check
    // low high mid all equal then low++ high--
    while (low <= high) {

      int mid = low + ((high - low) / 2);
      int midNo = nums[mid];
      int lowNo = nums[low];
      int highNo = nums[high];
      if (midNo < min) {
        min = midNo;
      }
      if (midNo >= lowNo) {
        // left side sorted
        if (lowNo < min) {
          min = lowNo;
        }
        // go for right unsorted side as min already got from left
        // sorted section
        low = mid + 1;

      } else if (midNo <= highNo) {
        // right side sorted
        if (midNo < min) {
          min = midNo;
        }

        // go for left unsorted side
        high = mid - 1;
      }
    }

    return min;
    }
}