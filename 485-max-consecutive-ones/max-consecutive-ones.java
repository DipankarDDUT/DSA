class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int longest=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
              if(nums[i]!=1){
                if(count>longest){
                    longest=count;
                }
                count=0;
              } else{
                count++;
              } 
        }

        if(count!=0){
            // for last cosecutive 1s
               if(count>longest){
                    longest=count;
                }
        }

        return longest;
    }
}