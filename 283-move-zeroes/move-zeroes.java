class Solution {
    public void moveZeroes(int[] nums) {
        

        // //brute
        // int noOfZeroes=0;

        // int zero=0;

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         noOfZeroes++;
        //     }
        // }
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        while(index<nums.length){
            nums[index]=0;
            index++;
        }
    }
}