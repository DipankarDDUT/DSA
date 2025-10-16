class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0)
            return 0;
        if (s.length() == 1)
            return 1;
        int hash = 256;
        int[] preMap = new int[hash];
        Arrays.fill(preMap, -1);
        int l = 0;
        int r = 0;
        int n = s.length();
        int max_len = 0;
        while (r < n) {
            // if value already in the window bigger than l means in window 
            if (preMap[s.charAt(r)] >= l) {
                // already exist in window 
                l++;
                // keep on  moving to right to remove the exisiting character from window
                // directly cant' move to l=r as dvdf r in d exist then i = r then v remvoed from max len then expected max len is 3 but output will be 2
                continue;
            }

            // add in the ASCII value of the character : index   
            // and will act as update if already exist
            preMap[s.charAt(r)] = r;
            // check each iteration for max_len
            max_len = Math.max(max_len, r - l + 1);
            r++;

        }

        return max_len;

    }
}