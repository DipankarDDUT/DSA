class Solution {
    public int heightChecker(int[] heights) {
        
        // it sees number of swaps + 1 is the answer
        int left=0;
        int right=heights.length-1;
        int[] expected=new int[heights.length];
     for(int i=0;i<heights.length;i++){
            expected[i]=heights[i];
            // due to already writte here input heights should nto be changed 
            // expected should change anyways 
        }
        // sorting in n
        // while(left<right){
        //     if(heights[left]>=heights[right]){
        //         int temp=heights[left];
        //         heights[left]=heights[right];
        //         heights[right]=temp;
        //         right--;
        //     }else{
        //         left++;
        //     }
        // }
        Arrays.sort(heights);


        int no_of_misPlace=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                no_of_misPlace++;
            }
        }

        return no_of_misPlace;

   

    }
}