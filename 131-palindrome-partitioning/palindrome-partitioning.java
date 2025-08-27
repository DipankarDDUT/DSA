class Solution {

  public List<List<String>> partition(String s) {
    List<List<String>> result = new ArrayList<>();
    List<String> current = new ArrayList<>();
    generatePartition(result, current, 0, s);
    return result;
  }

  public void generatePartition(List<List<String>> result, List<String> cur, int index, String s) {

    // check from the index pirvided whether
    // suppose aabaa index at 0
    // whether a substring yes then divide and generatePartition()
    // then aa substring yes same previous step
    // then aab substring no stop
    int length = s.length();
    if (index >= length) {
      result.add(new ArrayList<>(cur));
      return;
    }
    for (int i = index; i < length; i++) {
      String temp = s.substring(index, i + 1);
      boolean ifPallindrome = checkPalindrome(temp);
      if (ifPallindrome) {
        cur.add(temp);
        generatePartition(result, cur, i + 1, s);
        cur.remove(cur.size() - 1);
      }
    }
  }

  public boolean checkPalindrome(String s) {

    int length = s.length() - 1;
    int i = 0;
    while (i < length) {
      if (s.charAt(i) != s.charAt(length)) {
        return false;
      }
      i++;
      length--;
    }

    return true;
  }
}
