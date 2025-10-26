class Solution {

  private static final int MOD = 1000000007;

  public int[] previousSmallerElementIndex(int[] arr) {

    // if no previous  smaller element gives -1
    int n = arr.length;
    int[] result = new int[arr.length];
    Stack<Integer> stack = new Stack<>();
    // next start from last
    for (int i = 0; i < n; i++) {
      // all numbers larger not equal to the number will
      // be popped out
      // we are storing index in stack
      while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
        stack.pop();
      }
      if (stack.isEmpty()) {
        result[i] = -1;
      } else {
        // remaining is the previous smaller element
        result[i] = stack.peek();
      }
      stack.push(i);
    }

    return result;
  }

  public int[] nextSmallerElementIndex(int[] arr) {

    // if no next smaller element gives arr.length
    //
    int n = arr.length;
    int[] result = new int[arr.length];
    Stack<Integer> stack = new Stack<>();
    // next start from last
    for (int i = n - 1; i >= 0; i--) {
      // all numbers larger or eqaul to the number will
      // be popped out
      // we are storing index in stack
      while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
        stack.pop();
      }
      if (stack.isEmpty()) {
        result[i] = n;
      } else {
        // remaining is the next smaller element
        result[i] = stack.peek();
      }
      stack.push(i);
    }

    return result;
  }

  public int sumSubarrayMins(int[] arr) {
    if (arr.length == 0) return 0;
    long result = 0L;
    int[] NSE = nextSmallerElementIndex(arr);
    int[] PSE = previousSmallerElementIndex(arr);
    // to get the boundary where the current element is
    // minimum
    // for each index check the previous smaller element index pos
    // .. and next smaller element pos

    for (int i = 0; i < arr.length; i++) {
      // frequency
      long leftFreq = (i - PSE[i]);
      long rightFreq = (NSE[i] - i);
      // result is element * freq
      result = (result + (arr[i] * leftFreq * rightFreq) % MOD)%MOD;
    }

    return (int) result;
  }
}
