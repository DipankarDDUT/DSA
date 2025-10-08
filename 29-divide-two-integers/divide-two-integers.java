class Solution {
  public int divide(int dividend, int divisor) {

    // Base case
    if (dividend == divisor) return 1;
    // Why your code returns 0 instead of 2147483647
    // Integer.MIN_VALUE = -2147483648
    // as max int possible 2147483647 one less
    // Math.abs(Integer.MIN_VALUE) = still -2147483648 (because it can’t be represented as a
    // positive int — it overflows).
    // So in your code, n becomes negative, and the while loop never runs, returning 0.
    if (dividend == Integer.MIN_VALUE && Math.abs(divisor) == 1) {
      // divident is sure -ve as positive that value cannot be represented
      // if divisor is 1
      // if 1 is negative then its positive we have to return MAX
      // else 1 is positive and dividend is negative
      // return dividend
      return divisor > 0 ? dividend : Integer.MAX_VALUE; // 2147483647
    }
    // Variable to store the sign of result
    boolean isPositive = true;

    // Updating the sign of quotient
    if (dividend >= 0 && divisor < 0) isPositive = false;
    else if (dividend < 0 && divisor > 0) isPositive = false;

    // Storing absolute dividend & divisor
    long n = Math.abs((long)dividend);
    long d = Math.abs((long)divisor);

    // Variable to store the answer
    long ans = 0;

    /* Looping while dividend is
    greater than equal to divisor */
    while (n >= d) {
      int count = 0;

      /* Finding the required
      largest power of 2 */
      while (n >= (d << (count + 1))) {
        count++;
      }

      // Updating the answer & dividend
      ans += (1 << count);
      n -= d * (1 << count);
    }

    // Handling overflowing condition
    if (ans > Integer.MAX_VALUE && isPositive) return Integer.MAX_VALUE;
    if (ans > Integer.MAX_VALUE && !isPositive) return Integer.MIN_VALUE;

    /* Returning the quotient
    with proper sign */
    return isPositive ? (int)ans : -1 * (int)ans;
  }
}
