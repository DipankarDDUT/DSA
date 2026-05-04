class Solution {
    public int jump(int[] nums) {
        
        int furthest=0;
        int currentEnd=0;
        // whenever we can reach furthest we update jump
        int jump=0;

        for(int i=0;i<nums.length-1 && currentEnd<nums.length-1;i++){
            furthest=Math.max(nums[i]+i,furthest);
            if(i==currentEnd){
                // for 1st index alwasy jump and currentEnd will get the furthest 
                // whenever i reach to currentEnd means now we will make the jump
                jump++;
                currentEnd=furthest;
            }
        }


        return jump;
    }
}