class Solution {
    public int longestOnes(int[] nums, int k) {
        
    int flip = k;
    // last 1 after flip ends we have to keep track
    // as flip ends then from that index again counting will start
    int left = 0;
    int right = 0;
    int n = nums.length;
    int max_len = 0;
    while (right < n) {
      if (nums[right] == 0) {
        if (flip > 0) {
          flip--;
          right++;
        } else {
          // no flip
          // no flip left: move left until we release a flipped zero
          if (nums[left] == 0) {
            flip++;
          }
          left++;

    
        }
      } else {
        right++;
      }
      // right is exclusive so curren window is right -left 
      max_len = Math.max(max_len, right - left);
    }

    return max_len;
    }
}