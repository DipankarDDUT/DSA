class Solution {
    public int characterReplacement(String s, int k) {

        // Brute
        int max_len = 0;
        int[] hash = new int[26];
   

        int left = 0;
        int max_freq = 0;
        for (int right = 0; right < s.length(); right++) {

            // get the max freq so that we know how many changes stil if 
            // changes>k then incremenet left 
            // we have to make removing the max  freq
            hash[s.charAt(right) - 'A'] = hash[s.charAt(right) - 'A'] + 1;
            max_freq = Math.max(max_freq, hash[s.charAt(right) - 'A']);
            int changes = (right - left + 1) - max_freq;
            if (changes <= k) {
                // means changes still less 
                max_len = Math.max(max_len, right - left + 1);
            } else {
                // increment left and decrement from hash 
                hash[s.charAt(left) - 'A'] = hash[s.charAt(left) - 'A'] - 1;
                left++;
            }

        }

        return max_len;
    }
}
