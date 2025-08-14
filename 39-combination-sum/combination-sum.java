class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();
    getCombinationSum(candidates, 0, target, ans, result);
    return result;
  }

  public void getCombinationSum(
      int[] candidates, int index, int target, List<Integer> ans, List<List<Integer>> result) {

    if (target == 0) {
      result.add(new ArrayList<>(ans));
      return;
    }

    if (target < 0 || index >= candidates.length) {
      return;
    }

    // take
    ans.add(candidates[index]);
    getCombinationSum(candidates, index, target - candidates[index], ans, result);
    ans.remove(ans.size() - 1);
    // not take
    getCombinationSum(candidates, index + 1, target, ans, result);
  }
}
