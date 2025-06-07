class Solution {

    public int findPascalValue(int n,int r){
        r=r>n-r?r:n-r;
        int row=n;
        long mul=1;
        for(int i=1;i<=r;i++){
            mul*=row;
            mul/=i;
            row--;
        }

        return (int)mul;
    }
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> result=new ArrayList<>();
        result.add(1);
        for(int i=1;i<=rowIndex;i++){
            int temp=findPascalValue(rowIndex,i);
            result.add(temp);
        }

        return result;
    }
}