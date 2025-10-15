class Solution {
    public int[][] merge(int[][] intervals) {

        if (intervals.length == 0 || intervals.length == 1) {
            return intervals;
        }
        // sort based on start time 
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> result = new ArrayList<>();
        boolean anyMergeDone = false;

        int curS = intervals[0][0];
        int curE = intervals[0][1];   
        int i=1;
        while(i<intervals.length){
            //next will be alwasy i pointer
            int nextS = intervals[i][0];
            int nextE = intervals[i][1];

            // keep om going right keep on merging 
            // keeping to current if no overlapping simply add if pverlapping
            // get the lastEnding time of last interval overlapping
            // if overlap do not add just update else add 
            if(curE>=nextS){
                // update to get the max ending 
                // dont increment as i will be checked again curE which is larger than nextS then else block 
                    curE=Math.max(nextE,curE);
            }else{
                // no overlap 
                // add the previoud curs curE
                 result.add(new int[] { curS,curE });
                 // update the curS curE
                 curS=nextS;
                 curE=nextE;

            }
                  i++;



        }
        // add the last index 
          result.add(new int[] { curS,curE });
        return result.toArray(new int[result.size()][]);

    }
}