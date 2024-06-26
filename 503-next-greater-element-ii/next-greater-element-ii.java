class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> st=new Stack<>();
        int result[]=new int[nums.length];
        for(int i=(2 * nums.length)-1;i>=0;i--){
            // as usual start from last  1 2 1 1 2 1 last 3 are imaginary
            int index=0;
            if(i>=nums.length){
                index=i-nums.length;
            }else{
                index=i;
            }
            while(!st.isEmpty() && st.peek()<=nums[index]){
                st.pop();
            }
            // add to result only if nums.length
            if(!st.isEmpty() && i<nums.length ){
                    result[index]=st.peek();
            }else if (st.isEmpty() && i<nums.length ){
                result[index]=-1;
            }
            st.push(nums[index]);
        }

        return result;
    }
}