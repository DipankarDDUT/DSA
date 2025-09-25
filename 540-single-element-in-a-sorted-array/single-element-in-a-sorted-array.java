class Solution {
    public int singleNonDuplicate(int[] nums) {

     // lets solve it in O(n)
     // check each pair 
     // there may be case 1 left after all the pair 
    int i=0;
     while(i<nums.length-1){
        if(nums[i]!=nums[i+1]){
            return nums[i];
        }
        i=i+2;
     }

        // as still not found then  last element is ans 
        return nums[i];
    }

}