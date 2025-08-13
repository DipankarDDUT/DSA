class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        generateSubsets(0, nums, ans, result);
        return result;

    }

    public void generateSubsets(int index, int[] nums, List<Integer> ans, List<List<Integer>> result) {

        if (index == nums.length) {
            result.add(new ArrayList<>(ans));
            return;
        }
        // do not take 
        generateSubsets(index + 1, nums, ans, result);
        ans.add(nums[index]);
        //take
        generateSubsets(index + 1, nums, ans, result);
        // removing is requored 
        //             Step 1: index = 0, ans = []
        //    -> Skip 1
        //       index = 1, ans = []
        //          -> Skip 2 → add []
        //          -> Take 2  → add [2]
        //    -> Take 1
        //       ans = [1]   <-- stays like this for next path
        //       index = 1
        //          -> Skip 2 → add [1]   ✅ correct
        //          -> Take 2  → add [1,2]

        // so take 1 during backtracking the newly added is removed 
        ans.remove(ans.size()-1);

    }

}