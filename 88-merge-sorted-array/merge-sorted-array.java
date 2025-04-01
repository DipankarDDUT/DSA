class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
        // Brute
        // int i=0;
        // int j=0;
        // //have to put in nums1
        // int k=0;
        // int temp[]=new int[nums1.length];
        // while(i<m && j<n){
        //     if(nums1[i]>=nums2[j]){
        //         temp[k]=nums2[j];
        //         j++;
        //         k++;
        //     }else{
        //         temp[k]=nums1[i];
        //         i++;
        //         k++;
        //     }
        // }
        // while(i<m){
        //     temp[k++]=nums1[i++];
        // }
        // while(j<n){
        //     temp[k++]=nums2[j++];
        // }

        // k=0;
        // while(k<temp.length){
        //     nums1[k]=temp[k];
        //     k++;
        // }

        //Optimal
        int i=m-1;
        int j=n-1;
        int r=m+n-1;
        while(i>=0 && j>=0){
        
            if(nums2[j]>=nums1[i]){
                nums1[r]=nums2[j];
                r--;
                j--;
            }else{
             nums1[r]=nums1[i];
             r--;
             i--;
            }
        }
        while(r>=0 && j>=0){
            nums1[r--]=nums2[j--];
        }

          while(r>=0 && i>=0){
            nums1[r--]=nums1[i--];
        }



    }
}