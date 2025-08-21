class Solution {
    public int thirdMax(int[] nums) {

        //brute is sort the array 
        // then get the rightmose index 
        // time O(nlogn)

        // Optimal is O(n)

        // let's find the second largest first 
        int n = nums.length;
                // input 1 2 -2147483648
        // its actual MIN_VALUE not sentinel 
        // then we have to take long instead of int
        // int firstL = Integer.MIN_VALUE, secondL = Integer.MIN_VALUE, thirdL = Integer.MIN_VALUE;
             long firstL = Long.MIN_VALUE, secondL = Long.MIN_VALUE, thirdL = Long.MIN_VALUE;
        // firstL>secondL>thirdL
        // so first assigment of condition value to firstL then secondL then thirdL
        // important for same values in array 
        for (int i = 0; i < n; i++) {
            if (nums[i] > firstL && nums[i] > secondL && nums[i] > thirdL) {
                thirdL = secondL;
                secondL = firstL;
                firstL = nums[i];
            } else if (nums[i] < firstL && nums[i] > secondL && nums[i] > thirdL) {
                thirdL = secondL;
                secondL = nums[i];

            } else if (nums[i] > thirdL && nums[i] < secondL && nums[i] < firstL) {
           
                thirdL = nums[i];
            }
        }

        // now suppose indeed 

        //if no third largest exist then the first largest element should be returned
        // now as integer value input is handled also
        if(thirdL==Long.MIN_VALUE){
            return (int)firstL;
        }

        return (int)thirdL;
    }
}