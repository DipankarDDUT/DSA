class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int result[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
            result[i]=Math.abs(nums[i]);
        }

        int left=0;
        int right=nums.length-1;
        while(left<=right){
            if(result[right]<result[left]){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                right--;
            }
            left++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }
}