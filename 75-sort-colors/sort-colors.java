class Solution {
     public static void swap(int[] arr,int n,int m){
        int temp=arr[n];
        arr[n]=arr[m];
        arr[m]=temp;
    }
    public void sortColors(int[] nums) {
         int zero=0;
        int one=0;
        int two=nums.length-1;
        
        while(one<=two){
            if(nums[one]==0){
                swap(nums,one,zero);
                one++;
                zero++;
            }else if(nums[one]==1){
                one++;
            }else{
                swap(nums,two,one);
                two--;
            }
        }
    }
}