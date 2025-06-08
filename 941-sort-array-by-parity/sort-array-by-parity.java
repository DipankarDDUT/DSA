class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        if(nums.length<2){
            return nums;
        }
        int even=0;
        int odd=nums.length-1;
        while(even<odd){
            if(nums[even]%2!=0){
                int temp=nums[odd];
                nums[odd]=nums[even];
                nums[even]=temp;
                odd--;
            }else{
       
                even++;
            }
        }

        return nums;
    }
}