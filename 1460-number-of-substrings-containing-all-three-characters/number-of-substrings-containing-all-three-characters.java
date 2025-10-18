class Solution {
  public int numberOfSubstrings(String s) {
    // your code goes here
    if (s.length() <= 2) return 0;
    int n = s.length();
    // as only characters allowed is a b c
    int result = 0;
    // array will be like last seen will store index of all occurence
    // lowest one is we need to find and anything left of lowest is valid substrings
    int[] hash = new int[3];
    Arrays.fill(hash,-1);
    for (int i = 0; i < n; i++) {
      // for each substring
        hash[s.charAt(i) - 'a'] = i;
        int min=Integer.MAX_VALUE;
        if (hash[0]!=-1 &&  hash[1]!=-1 && hash[2]!=-1) {
            result++;
            // valid substring
            // get the lowest index 
          for(int k=0;k<3;k++){
            min=Math.min(min,hash[k]);
          }
          // got the min , add to the result anything left is also valid substring 
          result+=min;

        }
    }
    return result;
  }
}

