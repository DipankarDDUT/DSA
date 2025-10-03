
class Solution {
    public int findContentChildren(int[] g, int[] s) {

        if (g.length == 0 || s.length == 0) return 0;
        int left = 0;
        int right = 0;
        Arrays.sort(s);
        Arrays.sort(g);
        int countOfMaximumsgs = 0;
        while (left < s.length && right < g.length) {
            int s1 = s[left];
            int g1 = g[right];
            if (s1 >= g1) {
                //s big enough to satisfy the greed 
                left++;
                right++;
                countOfMaximumsgs++;
            } else {
                // s is small
                left++;
            }
        }

        return countOfMaximumsgs;
    }
}