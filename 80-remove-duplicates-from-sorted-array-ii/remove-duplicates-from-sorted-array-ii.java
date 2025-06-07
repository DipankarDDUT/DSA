class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length<2){
            return nums.length;
        }
        int dupNo=nums[0];
        int dupFreq=1;
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=dupNo){
                dupNo=nums[i];
                dupFreq=1;
                nums[index++]=nums[i];
            }else if(nums[i]==dupNo){
                if(dupFreq<2){
                    nums[index++]=nums[i];
                    dupFreq++;
                }else{
                    dupFreq++;
                }
            }
        }

        return index;
    }
}