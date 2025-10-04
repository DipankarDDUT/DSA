class Solution {
    public int singleNumber(int[] nums) {
        
        // Brute sort the array then use two pointer approach check 
       if(nums.length==0) return -1;
         Arrays.sort(nums);
        int i=0;
        while(i<nums.length-2){
            // check in group of 3
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i+2]){
                return nums[i];
            }else{
                i=i+3;
            }
        }

        // if number in rightmost 
        if(i<nums.length) return nums[nums.length-1];

        return -1;

    }
}