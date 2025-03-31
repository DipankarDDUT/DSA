class Solution {
    public void swap(int m,int n,int[] nums){
        if(m==n)return;
        int temp=nums[m];
        nums[m]=nums[n];
        nums[n]=temp;
    }
    public void sortColors(int[] nums) {

        //Brute
        // int i=0,j=0,k=0; 
        // for(int l=0;l<nums.length;l++){
        //     if(nums[l]==0){
        //         i++;
        //     }else if(nums[l]==1){
        //         j++;
        //     }else{
        //         k++;
        //     }
        // }
        // int index=0;
        // int l=0;
        // while(l<i){
        //     nums[index]=0;
        //     l++;
        //     index++;
        // }
        // l=0;
        //    while(l<j){
        //     nums[index]=1;
        //     l++;
        //     index++;
        // }
        //  l=0;
        //    while(l<k){
        //     nums[index]=2;
        //     l++;
        //     index++;
        // }


        //Optimal
        int zero=0;
        int one=0;
        int two=nums.length-1;
        while(one<=two){
            if(nums[one]==1){
                one++;
            }else if(nums[one]==0){
                swap(one,zero,nums);
                one++;
                zero++;
            }else{
                swap(one,two,nums);
                two--; 
            }
        }
    }
}