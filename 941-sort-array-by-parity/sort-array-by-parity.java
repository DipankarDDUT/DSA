class Solution {
    public void swap(int[] nums, int m , int n){
        if(nums[m]==nums[n]||m==n)return;
        int temp=nums[m];
        nums[m]=nums[n];
        nums[n]=temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        // Brtue will extra same array 
        // loop through the array and add the evn number only and keep the count
        // then cnt + 1 from index  start adding loop again to add odd 
        // then copy the whole array back 
        // time O(3n) space O(n)

        if(nums.length==0||nums.length==1){
            return nums;
        }
        int even=0;
        int odd=nums.length-1;
        while(even<odd){
            if(nums[even]%2==0){
                even++;
            }
            else if(nums[odd]%2!=0){
                odd--;
            }else{
            swap(nums,even,odd);

            }
        }

        return nums;
    }
}