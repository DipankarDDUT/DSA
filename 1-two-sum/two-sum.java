class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];

        HashMap<Integer,Integer> preMap=new HashMap<>();
        // value index

        for(int i=0;i<nums.length;i++){
            int remain=target-nums[i];
            if(preMap.containsKey(remain)){
                result[0]=i;
                result[1]=preMap.get(remain);
                return result;
            }else{
                preMap.put(nums[i],i);
            }
        }

        return result;


    }
}