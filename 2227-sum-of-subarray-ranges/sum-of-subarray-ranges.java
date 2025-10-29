class Solution {

    public long subArrayRanges(int[] nums) {

        long result = 0L;
        // 1 element minus will give 0 
        if (nums.length < 2)
            return result;
        // brute
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            int min = nums[i];
            // j=i+1 to skip 2-2 one element  
            for (int j = i + 1; j < nums.length; j++) {
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                // every iteration is subarray starting from i one lement adding 
                result += max - min;
            }

        }

        return result;
    }
}