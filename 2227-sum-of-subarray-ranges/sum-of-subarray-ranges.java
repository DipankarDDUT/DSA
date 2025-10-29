class Solution {
    // summation of subarray largest - summation of subarray smallest 
    public int[] nextGreaterElement(int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;
        //prev start from 1st index
        int min = n;
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            // <= strict should be in prevGreater prevSmaller
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                stack.pop();
                // pop all in stack that is smaller than the current 
            }
            if (stack.isEmpty()) {
                result[i] = n;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);

        }

        return result;
    }

    public int[] prevGreaterElement(int[] nums) {
        int[] result = new int[nums.length];

        //prev start from 1st index
        int min = -1;
        int n = nums.length;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {

            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
                // pop all in stack that is smaller than the current 
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);

        }

        return result;
    }

    public int[] nextSmallerElement(int[] nums) {
        int[] result = new int[nums.length];

        //prev start from 1st index
        int min = nums.length;
        int n = nums.length;

        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
                // pop all in stack that is bigger than the current 
            }
            // if empty no smaller element to next take n 
            if (stack.isEmpty()) {
                result[i] = n;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);

        }

        return result;
    }

    public int[] prevSmallerElement(int[] nums) {

        int[] result = new int[nums.length];

        //prev start from 1st index
        int min = -1;
        int n = nums.length;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {

            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
                // pop all in stack that is bigger than the current 
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);

        }

        return result;
    }

    public long subArrayRanges(int[] nums) {

        long result = 0L;
        // 1 element minus will give 0 
        if (nums.length < 2)
            return result;

            //got the freq of element in each subarray when its max and from where to where its min and multiply by freq will gove the result

        int[] NGE=nextGreaterElement(nums);
        int[] PGE=prevGreaterElement(nums);
        int[] PSE=prevSmallerElement(nums);
        int[] NSE=nextSmallerElement(nums);
        
        long sumOfSmaller=0L;
        long sumOfLarger=0L;
        // summation of smaller elements in subarray 
        for(int i=0;i<nums.length;i++){
            long temp=(long)(NSE[i]-i)*(i-PSE[i])*nums[i];
            sumOfSmaller+=temp;
        }
         // summation of smaller elements in subarray 
        for(int i=0;i<nums.length;i++){
            // long to prevent overflow mix of positive large and large negative minimum
            //(NGE[i]-i)*(i-PGE[i])  int * int might overflow mak eone of them long 
            long temp=(long)(NGE[i]-i)*(i-PGE[i])*nums[i];
            sumOfLarger+=temp;
        }
        result=sumOfLarger-sumOfSmaller;

        return result;
    }
}