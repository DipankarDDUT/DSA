class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        generateCombination(nums,0,k,n,subset,result);
        return result;

    }
    public void generateCombination(int[] nums,int index,int k,int n,List<Integer> subset,List<List<Integer>> result){


        if(subset.size()==k){
            if(n==0){
                result.add(new ArrayList<>(subset));
            }
            return;
        }

        if(index>=nums.length){
            return;
        }

        //take
        subset.add(nums[index]);
        generateCombination(nums,index+1,k,n-nums[index],subset,result);
        subset.remove(subset.size()-1);

        generateCombination(nums,index+1,k,n,subset,result);



    }
}