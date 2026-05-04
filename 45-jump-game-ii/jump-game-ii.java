class Solution {
    public int jump(int[] nums) {
        
        int furthest = 0;
        int currentEnd = 0;
        int jump = 0;

        // traverse till second last index
        for (int i = 0; i < nums.length - 1 && currentEnd < nums.length - 1; i++) {
            
            // when reaching to end is not guranteed 
            if(i>furthest) return 0;


            // update the furthest index reachable within current jump range
            furthest = Math.max(nums[i] + i, furthest);

            // if we reach the end of current jump range, we must jump
            if (i == currentEnd) {
                jump++;
                currentEnd = furthest; // move to next range
            }
        }

        return jump;
    }
}