class Solution {

    public int[] xorQueries(int[] arr, int[][] queries) {
        // output map with queries 
        int[] output = new int[queries.length];
        if (arr.length == 0)
            return output;

        // will precompute the xor of array
        int[] preMap=new int[arr.length];
        int xorResult=0;
        for(int i=0;i<arr.length;i++){
            xorResult^=arr[i];
            preMap[i]=xorResult;
        }
        // precomputed then can use the concept of 1 to l-1 and 1 to right 


        for (int i = 0; i < queries.length; i++) {
            int[] row = queries[i];
            int left = row[0];
            int right = row[1];
            int XORFromLeft = 0; // XOR from 1 to left -1
            int XORFromRight = preMap[right]; // XOR from 1 to R
            // concept take the XOR of right as that is sum from 0 index than subtract the 
            // left -1 from the right 
            if(left==0){
                XORFromLeft=0;
            }else{
                XORFromLeft=preMap[left-1];
            }
            output[i] = XORFromRight ^ XORFromLeft;
        }

        return output;
    }
}