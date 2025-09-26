class Solution {
  public int singleNonDuplicate(int[] nums) {

    if (nums.length == 0) {
      return -1;
    }
    // Edge Cases
    // single element
    if (nums.length == 1) {
      return nums[0];
    }

    // now to reduce the edge cases check in loop again and again
    // previous elemnt exisit ot not . right side element exist or not
    // to remove those checks will check the leftmost and rightmost
    // as edge cases only
    if (nums[0] != nums[1]) {
      return nums[0];
    }

    if (nums[nums.length - 1] != nums[nums.length - 2]) {
      return nums[nums.length - 1];
    }

    int low = 1;
    int high = nums.length - 2;

    while (low <= high) {

      int mid = low+((high - low) / 2);
      if (nums[mid + 1] != nums[mid] && nums[mid] != nums[mid - 1]) {
        return nums[mid];
      }
      // if element in the odd index and -1 is same element oR
      // element is in even index and + 1 is the same element
      // means order not yet distorted , single element is in right side
      if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid%2==0 && nums[mid] == nums[mid + 1])) {
        low = mid + 1;
      } else {

        // element is in even index  -1 index same oR
        // elemet is in odd index and +1 is same  then distortion
        // element is in left side
        high = mid - 1;
      }
    }

    return -1;
  }
}
