class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // arrays already sorted by start time
    // Arrays.sort(Intervals,(a,b)->Integer.compare(a[0],b[0]));

    int[] temp = new int[2];
    ArrayList<int[]> res = new ArrayList<>();

    // add the new interval
    int i = 0;
    int n = intervals.length;
    // keep on going until end is smaller then newInterval start
    while (i < n && intervals[i][1] < newInterval[0]) {
      res.add(new int[] {intervals[i][0], intervals[i][1]});
      i++;
    }

    // now check current i smaller than n
    int curS = 0;
    int curE = 0;
    if (i < n) {
      // now there can b two condition 56 new interval
      // and 78 interval poitning
      // or merge required
      if (newInterval[1] < intervals[i][0] && newInterval[1] < intervals[i][1]) {
        // no merge required simple add
        res.add(new int[] {newInterval[0], newInterval[1]});
        // i++;
        // to get the Interval as
        curS = intervals[i][0];
        curE = intervals[i][1];
      } else {
        // merge the new Interval and current index

        // during merge no add
        curS = Math.min(newInterval[0], intervals[i][0]);
        curE = Math.max(newInterval[1], intervals[i][1]);
      }

    } else {
      // new interval will be added at last
      res.add(new int[] {newInterval[0], newInterval[1]});
      curS = newInterval[0];
      curE = newInterval[1];
      return res.toArray(new int[res.size()][]);
    }


    // now after new interval entry rest
    // get the last entry in res to compare

    i++; // point to next index
    while (i < intervals.length) {
      // end bigger or equal to start means overlap
      if (curE >= intervals[i][0]) {
        int min = Math.min(curS, intervals[i][0]);
        int max = Math.max(curE, intervals[i][1]);
        curE = max;
        curS = min;
        // dont add as this merge during merge no add
        //  res.add(new int[]{min,max});
      } else {
        // else prev curS curE smalller then next start
        // add the previous curS curE
        res.add(new int[] {curS, curE});
        curS = intervals[i][0];
        curE = intervals[i][1];
      }
      i++;
    }

    // last entry
    res.add(new int[] {curS, curE});

    return res.toArray(new int[res.size()][]);

    }
}