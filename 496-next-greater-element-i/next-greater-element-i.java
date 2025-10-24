class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // nums1 subset of nums2

        int[] result = new int[nums1.length];
        if (nums1.length > nums2.length)
            return result;
        // nums2 put in hashmap to get he index
        // number index
        HashMap<Integer, Integer> preMap = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            preMap.put(nums2[i], i);
        }

        // Brute
        for (int i = 0; i < nums1.length; i++) {
            // for each element in nums1 check in larger set 
            int max = -1;
            // get the index in nums2 then start from next item
            int index = preMap.get(nums1[i]);
            int num = nums1[i];

            for (int j = index + 1; j < nums2.length; j++) {
                if (num < nums2[j]) {
                    max = nums2[j]; // got the next max
                    break;
                }

            }
            result[i] = max;

        }

        return result;

    }
}