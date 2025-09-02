class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // set is used to avoid the duplicates as sorting is done
        // insertion order mismatch duplication also not 
        // possible like -1 -1 0 and 0 -1 -1 if not sorted then thi it
        // woulb be allowed 
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left=i+1;
            int right=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue; // to avoid duplicated 
            }
            while(left<right){
                    int sum=nums[i]+nums[left]+nums[right];
                    
                    if(sum>0){
                        while(right>left && nums[right]==nums[right-1]){
                            right--;
                        }
                        right--;

                    }else if(sum<0){
                        while(left<right && nums[left]==nums[left+1]){
                            left++;
                        }
                        left++;

                    }else{
                        result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                       
                           while(left<right && nums[left]==nums[left+1]){
                            left++;
                        }
                          while(right>left && nums[right]==nums[right-1]){
                            right--;
                        }
                         left++;
                        right--;
                    }
            }

        }

        return result;
    }
}