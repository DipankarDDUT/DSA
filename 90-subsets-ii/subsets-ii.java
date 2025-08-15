class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> subsets=new ArrayList<>();
        generateSubsets(nums,0,subsets,result);
        return result;
    }
    public void generateSubsets(int[] nums,int index, List<Integer> subsets,List<List<Integer>> result){

        if(index==nums.length){
            result.add(new ArrayList<>(subsets));
            return;
        }

        subsets.add(nums[index]);
        //take
         generateSubsets(nums,index+1,subsets,result);
        subsets.remove(subsets.size()-1);
        int nextIndex=index+1;
        while(nextIndex<nums.length && nums[nextIndex]==nums[index]){
            nextIndex++;
        }
        //not take
         generateSubsets(nums,nextIndex,subsets,result);


    }
}