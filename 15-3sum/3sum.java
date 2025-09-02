class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // as two pointer approach not used duplicates can be here 
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            HashMap<Integer, Integer> preMap = new HashMap<>();
            for (int j = i+1; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                int sum = -1 * (nums[i] + nums[j]);
                if (preMap.containsKey(sum)) {
                    int index = preMap.get(sum);
                    if (index != i && index != j) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[index]));
                    }
                } else {
                    preMap.put(nums[j], j);
                }

            }
        }

        return new ArrayList<>(result);
    }
}