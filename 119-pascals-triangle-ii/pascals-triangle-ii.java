class Solution {
    public int findElement(int k, int n) {

        // n=n-1; // making n n-1
        // r already -1 as iteratio started from 0
        k = Math.min(n - k, k);
        long result = 1;
        for (int i = 0; i < k; i++) {
            result *= n - i;
            result /= (i + 1);
        }

        return (int)result;

    }

    public List<Integer> getRow(int rowIndex) {
        int r = rowIndex;
        List<Integer> result = new ArrayList<>();
        // iterating for the whole row col =1 col =2 ...
        // as 0 indexed 
        for (int i = 0; i <=r; i++) {
            if (i == 0 || i == r) {
                result.add(1);
            } else {
                result.add(findElement(i, r));
            }
        }

        return result;
    }
}