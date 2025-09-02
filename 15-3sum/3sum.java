class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // set is used to avoid the duplicates as sorting is done
        // insertion order mismatch duplication also not 
        // possible like -1 -1 0 and 0 -1 -1 if not sorted then thi it
        // woulb be allowed 
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            HashMap<Integer, Integer> preMap = new HashMap<>();
            for (int j = i+1; j < nums.length; j++) {
                // i != j j!=i
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