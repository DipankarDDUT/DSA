class Solution {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    // your code goes here
    Arrays.sort(candidates);
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> tempAns = new ArrayList<>();
    getCombination(candidates, 0, target, tempAns, result);
    return result;
  }

  public void getCombination(
      int[] candidates, int index, int target, List<Integer> tempAns, List<List<Integer>> result) {
    if (target < 0) {
      return;
    }
    if (target == 0) {
      // target reduced to 0
      // we can reduce the primitive as scope is fiunction
      // pass by value , not reference
      // no issue during backtracking
      // but ans is reference
      // so new list is created with new reference
      // so any changes after this step will add in ans
      // but will not be reflected in the result as
      // new reference coipying the upto elements are added
      result.add(new ArrayList<>(tempAns));
      return;
    }

    if (index >= candidates.length) {
      // if index cross the length
      return;
    }

    int nextIndex = index + 1;
    while (nextIndex < candidates.length && candidates[index] == candidates[nextIndex]) {
      // skip duplicates
      nextIndex++;
    }

    // this doesnot work
    // index -1 checking different branch , it should check the current branch
    // while(index>0 && candidates[index]==candidates[index-1]){
    //     index++;
    // }
    // 1 1 2
    // 1 index duplicate go to 2 next take index+1 so 1 2 never tried

    // take
    tempAns.add(candidates[index]);
    // not nextIndex here , we have to take one element from each index
    getCombination(candidates, index + 1, target - candidates[index], tempAns, result);
    tempAns.remove(tempAns.size() - 1);

    // not take
    // why not take allowed to skip
    //     candidates = [1, 1, 2], target = 3
    // Two possible recursion paths produce the same [1, 2]:

    // Take first 1 → skip second 1 → take 2

    // Skip first 1 → take second 1 → take 2

    // Both give [1, 2], so you get a duplicate in the result.
    getCombination(candidates, nextIndex, target, tempAns, result);
  }
}
