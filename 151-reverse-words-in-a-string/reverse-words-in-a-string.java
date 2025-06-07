class Solution {
    public String reverseWords(String s) {
        String temp=s.trim();
        String words[]=temp.split(" ");

        StringBuilder st=new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            if(words[i].length()>0){
                st.append(words[i]);
                if(i!=0){
                   st.append(" ");
                }
            }
        }

        return st.toString();

    }
}