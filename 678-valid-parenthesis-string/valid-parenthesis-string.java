class Solution {
    public boolean checkValidString(String s) {
          int minOpening = 0;
    int maxOpening =0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        minOpening++;
        maxOpening++;
      }
     else if (s.charAt(i) == ')') {
        maxOpening--;
        minOpening--;
      }
     else if (s.charAt(i) == '*') {
        maxOpening++; // treated as ( 
        minOpening--; // treated as )
      }
      // no range * or ( only )
      if(maxOpening<0) return false;
      // keep range between 0 to +ve  anything negative return false
      minOpening=minOpening<0?0:minOpening;

    }
        //

    // opening still left means not correct
    if (minOpening > 0) return false;

    return true;
    }
}


