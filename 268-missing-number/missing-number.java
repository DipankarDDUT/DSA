class Solution {
    public int missingNumber(int[] nums) {
        

        // we gonna use sum of naturral numbers 
        //length we will as n 
        // if no diff then 0 is the answer
        int n=nums.length;
        if(n==0) return 0;
        int sum_of_natural_numbers=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        return sum_of_natural_numbers-sum;

    }
}