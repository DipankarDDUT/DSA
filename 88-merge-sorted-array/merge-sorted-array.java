class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
        // Brute
        int i=0;
        int j=0;
        //have to put in nums1
        int k=0;
        int temp[]=new int[nums1.length];
        while(i<m && j<n){
            if(nums1[i]>=nums2[j]){
                temp[k]=nums2[j];
                j++;
                k++;
            }else{
                temp[k]=nums1[i];
                i++;
                k++;
            }
        }
        while(i<m){
            temp[k++]=nums1[i++];
        }
        while(j<n){
            temp[k++]=nums2[j++];
        }

        k=0;
        while(k<temp.length){
            nums1[k]=temp[k];
            k++;
        }


    }
}