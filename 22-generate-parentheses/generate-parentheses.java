class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        String s="(";
        generate(n,1,s,1,0,result);
        return result;
    }

    public void generate(int n,int index,String s,int open, int close, List<String> result){

        if(open==close && index==2 * n){
            result.add(s);
            return;
        }

        if(open>n){
            // as parenthesis need to be balanced
            // as open crossed the midway
            return ;
        }

        if(open<n){
            generate(n,index+1,s+"(",open+1,close,result);
        }
        if(open>close){
            generate(n,index+1,s+")",open,close+1,result);
        }
    }
}