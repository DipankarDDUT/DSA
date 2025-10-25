class Solution {
  public int[] nextGreaterElements(int[] arr) {

    int[] result = new int[arr.length];
    // number descending then all be -1 after this loop
    Stack<Integer> stack = new Stack<>();
    // hypothethical same array added as tail
    for (int i = (2 * arr.length) - 1; i >= 0; i--) {
      while (!stack.isEmpty() && stack.peek() <= arr[i%arr.length]) {
        stack.pop();
      }
      if (i < arr.length) {
        if (stack.isEmpty()) {
          result[i] = -1;
        } else {
          result[i] = stack.peek();
        }
      }

      stack.push(arr[i%arr.length]);
    }

    return result;
  }
}
