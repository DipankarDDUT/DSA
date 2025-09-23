class Solution {
    public boolean search(int[] nums, int target) {
    

    if (nums.length== 0) {
      return false;
    }

    int high = nums.length - 1;
    int low = 0;

    while (low <= high) {
      int mid = low + ((high - low) / 2);
      int getLow = nums[low];
      int getMid = nums[mid];
      int getHigh = nums[high];
      if (getMid == target) return true;
      // Ambiguous case due to duplicates: can't decide which half is sorted
      // as irt will always see left side is sorted which might not be right 
      if (getLow == getMid && getMid == getHigh) {
        // migh be n time as all are duplicates precisely n/2 
        low++;
        high--;
      }
      else if (getMid >= getLow) {
        // left section is sorted
        // if exist target in range
        if (target >= getLow && target < getMid) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      } else {
        // right section is sorted
        // if exist target in range
        if (target > getMid && target <= getHigh) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
    }

    return false;
  }
}

