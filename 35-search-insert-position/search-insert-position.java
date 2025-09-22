class Solution {
    public int searchInsert(int[] nums, int target) {
        
        // Brute force
        // as array is already sorted
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }else{
                if(nums[i]>target){
                    return i;
                }
            }
        }
        

        // target should be +1 index of the array 
        return nums.length;

        
        // if not found either will be on the either of the end 


    }
}