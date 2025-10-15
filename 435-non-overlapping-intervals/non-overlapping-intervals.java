class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        // Sort Based on end time  ascending order 
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1],b[1]));

        int intervalsRemoved = 0;
        int lastEndTime = Integer.MIN_VALUE;
        for (int i = 0; i < intervals.length; i++) {
            int curStartTime = intervals[i][0];
            int curEndTime = intervals[i][1];
            // if interval removed then don't update the lastEndTime as that is ignored

            if (curStartTime < lastEndTime) {
                // if lastEndTime more than cur interval start time means
                // overlapping so need to be removed 
                intervalsRemoved++;
            } else {
                lastEndTime = curEndTime;
            }
        }

        return intervalsRemoved;
    }
}