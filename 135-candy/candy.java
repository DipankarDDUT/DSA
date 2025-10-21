class Solution {
    public int candy(int[] ratings) {
        // your code goes here
        int left[] = new int[ratings.length];
        int right[] = new int[ratings.length];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        if (ratings.length == 0)
            return 0;
        if (ratings.length == 1)
            return 1;
        // will do pass then take max of both 

        // Left Pass
        // skip the first index 
        for (int i = 1; i < ratings.length ; i++) {
            // if equal no change in value of array 
            if (ratings[i] > ratings[i-1]) {
                // either bigger than left or right +1 of last count
                left[i] = left[i-1] + 1;
            }
        }
 for (int i = 0; i < ratings.length ; i++) {
    System.out.print(left[i]+"\t");
 }
    System.out.println();

        // right to left pass
        // last index can be skipped 
        for (int i = ratings.length - 2; i >= 0; i--) {
            // if equal no change in value of array 
            if (ratings[i] > ratings[i+1]) {
                // either bigger than left or right +1 of last count
                right[i] = right[i+1] + 1;
            }
        }

        for (int i = 0; i < ratings.length ; i++) {
    System.out.print(right[i]+"\t");
 }
    System.out.println();

        int sum = 0;
        // max among both 
        for (int i = ratings.length - 1; i >= 0; i--) {
            sum = Math.max(right[i], left[i]) + sum;
        }

        return sum;
    }
}
