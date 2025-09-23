class Solution {
    public int search(int[] nums, int target) {
        // find the k
        // if no element
        if(nums.length==0){
            return -1;
        }
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+((high-low)/2);
            if(target==nums[mid]){
                return mid;
            }
            // check  left part is sorted 
            else if(nums[mid]>=nums[low]){
                // left part is sorted 
                // check target can be between this two number then 
                //change the high and low or else eleimate this part 
                if(target>= nums[low] && target<nums[mid]){
                    // for mid equality not required as already check in if 
                    // target in range 
                    high=mid-1;
                }else{
                    // elimate teh sorted section 
                    low=mid+1;
                }

            }
                else{
                //  right part is sorted
                if(target> nums[mid] && target<=nums[high]){
                      // for mid equality not required as already check in if 
                    // target in range 
                    low=mid+1;
                }else{
                    // elimate the right sorted section 
                    high=mid-1;
                } 
            }
        }

        return -1;
    }
}