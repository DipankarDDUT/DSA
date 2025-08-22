class Solution {
    public int removeDuplicates(int[] nums) {
        

        if(nums.length==0) return 0;
        // check the next index if not same increment the  index 
        // if not keep the index there once got not same element , increment 
        // the index 
        int index=0;  // which in turn count of unique elements
        for(int i=1;i<nums.length;i++){
            if(nums[index]!=nums[i]){
                // not equal
                //to avoid same elements swap
                if(index+1!=i){
                    // swap logic not required
                    // we are not bothered about last elements
                    // int temp=nums[index+1];
                    // nums[index+1]=nums[i];
                    // nums[i]=temp;
                    nums[index+1]=nums[i];
                }
                index++;
            }
        }

        // as index 0 based but count 1 based
        // even all same then 1 is still unique

        return index+1;
    }
}