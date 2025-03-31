class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Brute 
        Arrays.sort(nums);
        return nums[nums.length-k];

    }
}