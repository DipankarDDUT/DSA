class Solution {

    public int getTotalDigits(int num){
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        
        int count=0;
        for(int i=0;i<nums.length;i++){
                if(getTotalDigits(nums[i])%2==0){
                    count++;
                }
        }
        return count;
    }
}