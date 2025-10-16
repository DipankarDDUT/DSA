class Solution {
    public int maxScore(int[] cardPoints, int k) {

        // kind of circular array we need to treat each element as leader then if other 3 more than array that will start from begining thats how it will be 

        if (cardPoints.length < k)
            return -1;

        /* with each iteration it will move to right place so leader will be deducted and 
        index value will be added and check for max sum */

        int max_sum = 0;
        for (int i = 0; i < k; i++) {
            max_sum += cardPoints[i];
        }
        if (cardPoints.length == k)
            return max_sum;
        int sum = max_sum;
        int n = cardPoints.length;
        int leader = k-1;

        //take first sum already done above then move from 3 to 9 then from 2 3 to 
        // 8 9 like that moving otowards left here leader will be 3 first then keep on changing   1 2 3     7 8 9 

        // start from right and move towards k 
        for (int i = n - 1; i >= n - k; i--) {
            sum -= cardPoints[leader]; // subtracting suppose 3 
            sum += cardPoints[i]; // and will add 9 like that 
            leader--;
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum;

    }
}