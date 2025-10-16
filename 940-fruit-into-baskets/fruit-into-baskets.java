class Solution {
  public int totalFruit(int[] fruits) {
    /*
     Brute
        from each index  take a Set<Integer>
            inner same index start if set<=2 calcualte the max_fruits
            else break from inner loop
    */

    if (fruits.length == 0) return 0;
    if (fruits.length == 1) return 1;
    int right = 0;
    int left = 0;
    int max_fruits = 0;
    int n = fruits.length;
    // fruit type , index
    HashMap<Integer, Integer> map = new HashMap<>();
    while (right < n) {
      map.put(fruits[right], map.getOrDefault(fruits[right],0) + 1);

      // anytime size of map more than 2 means new type of fruit
      if (map.size() > 2) {
        // have to move the left till map has only 2 fruit
        // reduce the left fruit freq
        map.put(fruits[left], map.get(fruits[left]) - 1);
        if (map.get(fruits[left]) == 0) {
          // means removed one type of fruit
          map.remove(fruits[left]);
        }
        left++;
      }

      if (map.size() <= 2) {
        // not bigger than only calculate max_fruits
        max_fruits = Math.max(max_fruits, right - left + 1);
      }
      right++;
    }

    return max_fruits;
  }
}
