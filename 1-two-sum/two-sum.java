class Solution {
    public int[] twoSum(int[] nums, int target) {

        // // space n and time nlogn
        // int[] temp=Arrays.copyOf(nums,nums.length);
        // Arrays.sort(nums);
        // int i=0;
        // int j=nums.length-1;
        // int num1=-1;
        // int num2=-1;
        // while(i<j){
        //     if(nums[i]+nums[j]==target){
        //         System.out.println(nums[i]+"\t"+nums[j]);
        //         break;
        //     }else if(nums[i]+nums[j]>target){
        //         j--;
        //     }else{
        //         i++;
        //     }
        // }
        // // i and j still holds the target sum of sorted array
        // for(int k=0;k<temp.length;k++){
        //     if(temp[k]==nums[i] && num1==-1){
        //         num1=k;
        //     }else if(temp[k]==nums[j] && num2==-1){
        //         num2=k;
        //     }
        // }


        // return new int[]{num1,num2};

        // number , index
        HashMap<Integer,Integer> preMap=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            preMap.put(nums[i],i);
        } 

        for(int i=0;i<nums.length;i++){
            if(preMap.containsKey(target-nums[i]) && preMap.get(target-nums[i])!=i){
                return new int[]{i,preMap.get(target-nums[i])};
            }
        }
        return new int[]{};
    }
}