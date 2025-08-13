class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        generate(n,"",0,0,result);
        return result;
    }

    public void generate(int n,String s,int open, int close, List<String> result){

        if(open==close && open + close==2 * n){
            result.add(s);
            return;
        }

        if(open>n){
            // as parenthesis need to be balanced
            // as open crossed the midway
            return ;
        }

        if(open<n){
            generate(n,s+"(",open+1,close,result);
        }
        if(open>close){
            generate(n,s+")",open,close+1,result);
        }
    }
}