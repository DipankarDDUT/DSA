class Solution {
    public int searchInsert(int[] nums, int target) {
        return getInputIndex(nums,0,nums.length-1,target,nums.length);
    }

    public int getInputIndex(int[] nums, int low,int high, int target,int ans){
        // ans will change if bigger than ans and with the smallest index 
        // upper bound
        if(high>=low){
            int mid=low+((high-low)/2);
            if(target==nums[mid]){
                ans=mid;
                return mid;
            }
            else if(nums[mid]>target){
                if(ans>mid){
                    ans=mid;
                }
                return getInputIndex(nums,low,mid-1,target,ans);
            }else{
                return getInputIndex(nums,mid+1,high,target,ans);

            }
        }

        return ans;
    }
}