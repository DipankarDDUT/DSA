class Solution {
    public int pivotIndex(int[] nums) {
        int pivot =0;

        while(pivot<nums.length){
            // till second last
            int sumLeft=0;
            int sumRight=0;
            for(int i=0;i<pivot;i++){
                sumLeft+=nums[i];
            }
             for(int j=pivot+1;j<nums.length;j++){
                sumRight+=nums[j];
            }
            // if(sumLeft==0 && sumRight==0){
            //     return 0;
            // }
            if(sumLeft==sumRight){
                return pivot;
            }
            pivot++;
        }

        return -1;
    }
}