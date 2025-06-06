class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==1){
            return 1;
        }
        int count=1;
        for(int left=1;left<nums.length;left++){
            if(nums[left]!=nums[left-1]){
                nums[count]=nums[left];
                count++;
            }
        }

        return count;
    }
}