class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st=new Stack<>();
      
        char[] ch=s.toCharArray();
        for(char c:ch){
            if(c=='('||c=='{'||c=='['){
              st.push(c);
            }
            if(c==')'){
                if(st.isEmpty()||!(st.peek()=='(')){
                    return false;
                }else{
                    st.pop();
                }
            }else if(c=='}'){
 if(st.isEmpty()||!(st.peek()=='{')){
                    return false;
                }else{
                    st.pop();
                }
            }else if(c==']'){
           if(st.isEmpty()||!(st.peek()=='[')){
                    return false;
                }else{
                    st.pop();
                }
            }
        }

        if(st.isEmpty()){
            return true;
        }

      return false;
    }
}