class Solution {
  public int[] maxSlidingWindow(int[] arr, int k) {
    if (arr.length < k || arr.length == 0) {
      return arr;
    }

    // size of the list n =5 k =2 then 4 should be size
    int[] result = new int[arr.length - k + 1];
    Deque<Integer> dq = new LinkedList<>();
    int j = 0;

    for (int i = 0; i < arr.length; i++) {

      // we should remove the largest from the last window
      // but checking the index as we are storing index not num
      // that is top pollFirst() index  as it was max last window
      if (!dq.isEmpty() && dq.peekFirst()<=(i-k)) {

        dq.pollFirst();
      }
      // we need to maintain that current window should not have
      // previous element

      // all smaller and equal remove it
      // from the stack as we want maximum
      while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
        dq.pollLast();
      }

      dq.offerLast(i); // as top should have the max
      // how are we doing that , as anythign smaller than the current is removed
      // so only more than cur remains so means cur should go last not top
      // as whatever top now bigger which is max in current window

      // store the maximum
      // suppose k =3 then i should start from 2 index > 1
      if (i >= (k - 1)) {
        result[j++] = arr[dq.peekFirst()];
      }
    }

    return result;
  }
}
