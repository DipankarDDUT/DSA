class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
       List<List<Integer>> result=new ArrayList<>();

        for(int i=0;i<=Math.pow(2,nums.length)-1;i++){
            List<Integer> tempResult=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i & (1<<j))>0){
                    tempResult.add(nums[j]);
                }
            }
            result.add(tempResult);
        }
        return result;
    }
}