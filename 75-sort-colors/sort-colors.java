class Solution {
    public void replace(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int one=0;
        int zero=0;
        int two=nums.length-1;
        // why <= 
        // take this example 2 1 0
        // 1st iteration 0 1 2 zero 1 one 1 two also pointing to 1

        while(one<=two){
            int num=nums[one];
            if(num==0){
                replace(nums,one,zero);
                one++;
                zero++;
            }else if(num==2){
                replace(nums,one,two);
                two--;
            }else{
                //one 
                one++;
            }
        }
    }
}