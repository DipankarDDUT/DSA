class Solution {
    public String reverseWords(String s) {
        
        String[] words=s.split(" ");
        StringBuilder result=new StringBuilder();

        for(int i=0;i<words.length;i++){
            StringBuilder st=new StringBuilder();
            st.append(words[i]);
            st.reverse();
            if(i!=words.length-1){
              st.append(" ");
            }
            result.append(st.toString());
            
        }


        return result.toString();

    }
}