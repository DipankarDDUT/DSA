class Solution {
  public String minWindow(String s, String t) {
    int minS = -1;
    int minLength = Integer.MAX_VALUE;
    int[] hash = new int[256];
    for (char ch : t.toCharArray()) {
      hash[ch]++;
    }

    int count = 0;
    int i = 0; // i as left and j as right

    // current window
    for (int j = 0; j < s.length(); j++) {

      char c = s.charAt(j);
      if (hash[c] > 0) {
        // s char present then
        count++;
      }
      hash[c]--;
      // check count equals to t length shirk l left
      while (count == t.length()) {
        if (j - i + 1 < minLength) {
          // if current window smaller
          minLength = j - i + 1;
          minS = i;
        }
        // shrink until non t string character found
        // if left we got positive means present in t string
        // we have to add the i to the pool as we decrement from window
        // and shrinking the window return to pool 
        hash[s.charAt(i)]++;
        if (hash[s.charAt(i)] > 0) {
          // means required in T
          count--;
        }
        i++;
      }
    }

    return minS == -1 ? "" : s.substring(minS, minS + minLength);
  }
}
