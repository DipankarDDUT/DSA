class Solution {
    public int minBitFlips(int start, int goal) {
        // XOR will give 1 on each place where both has
        // different bit
        // then no of 1s is the ans

        int XOR = start ^ goal;
        int count = 0;
        while (XOR != 0) {

            // first get the remainder form right side
            //int rem=XOR & 1; // last number
            //if(rem>0) count++;
            count += XOR & 1;
            XOR = XOR >> 1; // move 1 place to right to remove
            // just calculated place
        }
        return count;
    }
}