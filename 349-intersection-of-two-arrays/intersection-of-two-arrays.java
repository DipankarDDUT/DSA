class Solution {

  public void addIfNotPresent(ArrayList<Integer> result, int element) {

    if (result.isEmpty() || (result.get(result.size() - 1) != element)) {
      result.add(element);
    }
  }

  public int[] intersection(int[] nums1, int[] nums2) {

    ArrayList<Integer> result = new ArrayList<>();
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int index1 = 0;
    int index2 = 0;
    int length1 = nums1.length;
    int length2 = nums2.length;
    while (index1 < length1 && index2 < length2) {
      if (nums1[index1] == nums2[index2]) {
        addIfNotPresent(result, nums1[index1]);
        index1++;
        index2++;
      } else if (nums1[index1] < nums2[index2]) {
        index1++;
      } else {
        index2++;
      }
    }

  

    return result.stream().mapToInt(Integer::intValue).toArray();
  }
}
