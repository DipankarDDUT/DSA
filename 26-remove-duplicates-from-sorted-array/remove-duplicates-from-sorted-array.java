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

        // + 1 checking is done last element will not be checked 

        // as two elements alwasy check have to check the last elment whether unique or not
        // if(nums[count]!=nums[nums.length-1] && count<nums.length+1){
        //     nums[count]=nums[nums.length-1]; 
        //     count++;
        // }

        return count;
    }
}