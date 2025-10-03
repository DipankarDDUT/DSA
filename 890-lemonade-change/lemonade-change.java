class Solution {
  public boolean lemonadeChange(int[] bills) {
    // your code goes here
    if (bills.length == 0) return false;
    int fiveDollarChange = 0;
    int tenDollarChange = 0;

    int left = 0;
    int n = bills.length;
    while (left < n) {
      int bill = bills[left];
      if (bill == 5) {
        // no issue as same price as lemonade no change
        fiveDollarChange++;
      } else if (bill == 10) {
        tenDollarChange++;
        int changeRequired = 5;
        if (fiveDollarChange > 0) {
          fiveDollarChange--;
        } else {
          return false;
        }
      } else {
        // either one 10bill one 5bill OR 3 5bill
        int changeRequired = 15;
        if (tenDollarChange > 0) {
          tenDollarChange--;
          // one 10 gone now check for 5
          if (fiveDollarChange > 0) {
            fiveDollarChange--;
          } else {
            return false;
          }
        } else {
          // if no 10bill then atleast 3 5bill

          if (fiveDollarChange > 2) {
            fiveDollarChange -= 3;
          } else {
            return false;
          }
        }
      }
      left++;
    }

    return true;
  }
}
