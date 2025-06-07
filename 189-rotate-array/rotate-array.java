class Solution {

    public void reverse(int[] nums, int left, int right){

            while(left<right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
    }
    public void rotate(int[] nums, int k) {

         k=k%nums.length;

         reverse(nums,0,nums.length-1);
         reverse(nums,0,k-1);
         reverse(nums,k,nums.length-1);


        // n time with k space complexity 
        // k=k%nums.length;
        // int temp[]=new int[k];
        // int right=nums.length-k;
        // int j=0;
        // // from k moved to temp array 
        // for(int i=right;i<nums.length;i++){
        //     temp[j++]=nums[i];
        // }

        // int lastIndex=nums.length-1;
        // int prevIndex=right-1;

        // while(prevIndex>=0){
        //     nums[lastIndex--]=nums[prevIndex--];
        // }

        // for(int i=0;i<k;i++){
        //     nums[i]=temp[i];
        // }


    }
}