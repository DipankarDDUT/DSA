class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        

        // brute force O(num1 length * num2 lenght)  O(n2)
        // for every num1 loop through nums2
        // keep a flag when to look for comparison
        // whenever num1 each found in num2 then toggle the flag to true then after wards look for comparison , after 
        // end of iteration irrespective of toggling always toggel of the flag to false
        int[] result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int num=nums1[i];
            boolean flag=false;
            int greater=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==num){
                    flag=true;
                    continue;
                }
                if(flag){
                    if(nums2[j]>num){
                        greater=nums2[j];
                        break;
                    }
                }
            }
            result[i]=greater;
        }
        return result;
    }
}