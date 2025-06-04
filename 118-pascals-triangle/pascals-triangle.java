class Solution {
    // public long getFactDif(long a, long b){
    //     long mul=1;
    //     long col=b;
    //     // choose which is smaller r! or (n-r)! for lesser iterations
    //     col=a-b>b?b:a-b;
    //     for(int i=1;i<=col;i++){
    //         mul=mul * (a-i+1);
    //         mul=mul/i;
    //     }

    //     return mul;
    // }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();

        for(int row=1;row<=numRows;row++){
            List<Integer> temp=new ArrayList<>();
            int res=1;
            for(int col=1;col<=row;col++){
                temp.add(res);
                res=res*(row-col);
                res=res/col;
                // long ans=getFactDif(row-1,col-1);
                // temp.add((int)ans);
            }
            result.add(temp);
        }
        return result;
    }
}