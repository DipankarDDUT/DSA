class Solution {
    public int heightChecker(int[] heights) {
     
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            if(heights[i]>largest){
                largest=heights[i];
            }
        }
        int[] freqArr=new int[largest+1];
        int mismatch=0;

        // lets create the freqArray
        for(int i=0;i<heights.length;i++){
            freqArr[heights[i]]+=1;
        }
        int index=0;
        for(int i=1;i<freqArr.length;i++){
            while(freqArr[i]!=0){
                if(heights[index]!=i){
                    mismatch++;
                }
                freqArr[i]--;
                index++;
            }

        }

        return mismatch;






    //  for(int i=0;i<heights.length;i++){
    //         expected[i]=heights[i];
    //         // due to already writte here input heights should nto be changed 
    //         // expected should change anyways 
    //     }
    //     // sorting in n
    //     // while(left<right){
    //     //     if(heights[left]>=heights[right]){
    //     //         int temp=heights[left];
    //     //         heights[left]=heights[right];
    //     //         heights[right]=temp;
    //     //         right--;
    //     //     }else{
    //     //         left++;
    //     //     }
    //     // }
    //     Arrays.sort(heights);


    //     int no_of_misPlace=0;
    //     for(int i=0;i<heights.length;i++){
    //         if(heights[i]!=expected[i]){
    //             no_of_misPlace++;
    //         }
    //     }

    //     return no_of_misPlace;

   

    }
}