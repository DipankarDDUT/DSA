class Solution {
    public int pivotIndex(int[] nums) {

        // Brute force 
        // int pivot =0;

        // while(pivot<nums.length){
        //     // till second last
        //     int sumLeft=0;
        //     int sumRight=0;
        //     for(int i=0;i<pivot;i++){
        //         sumLeft+=nums[i];
        //     }
        //      for(int j=pivot+1;j<nums.length;j++){
        //         sumRight+=nums[j];
        //     }
        //     // if(sumLeft==0 && sumRight==0){
        //     //     return 0;
        //     // }
        //     if(sumLeft==sumRight){
        //         return pivot;
        //     }
        //     pivot++;
        // }

        // return -1;

           int pivot =1;
           int sumLeft=0;
           int sumRight=0;
           for(int i=1;i<nums.length;i++){
            // taking 1st index as pivot
                sumRight+=nums[i];
           }
        if(sumLeft==sumRight){
                return 0;
            }
        while(pivot<nums.length){
    
            // add prev pivot as pivot not yet updated
            sumLeft+=nums[pivot-1];
            sumRight-=nums[pivot];
                    if(sumLeft==sumRight){
                return pivot;
            }
            pivot++;

 

        }

        return -1;


        
        

    }
}