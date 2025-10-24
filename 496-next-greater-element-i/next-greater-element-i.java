class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // nums1 subset of nums2

        int[] result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        if (nums1.length > nums2.length)
            return result;
        // nums2 put in hashmap to get he index
        // number , larger number to right || -1
        HashMap<Integer, Integer> preMap = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];
            // keep on popping until larger element found
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                //number and larger to the right
                preMap.put(num, -1);

            } else {
                preMap.put(num, stack.peek());
            }
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            // pass the number to get the larger to the right 
            result[i] = preMap.getOrDefault(nums1[i], -1);
        }
        return result;

    }
}