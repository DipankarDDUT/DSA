class Solution {
    public int thirdMax(int[] nums) {
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max && nums[i]>secMax){
                secMax=max;
                max=nums[i];
            }else if(nums[i]>secMax && nums[i]<max){
                secMax=nums[i];
            }
        }
      
        int thirdMax=Integer.MIN_VALUE;
        boolean assigned=false;
         System.out.println(thirdMax);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=thirdMax && nums[i]!=max && nums[i]!=secMax){
                thirdMax=nums[i];
                assigned=true;
            }
        }


        if(!assigned){
            return max;
        }
        return thirdMax;


    }
}