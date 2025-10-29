class Solution {
    public String removeKdigits(String nums, int k) {
       
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder("");

        if(k==nums.length()||nums.length()==0) return "0";
       for(int i=0;i<nums.length();i++){
            char c=nums.charAt(i);
            // pop only when k>0 or else simply push 
            while(!stack.isEmpty() && stack.peek()>c && k>0){
                // all elements in stack larger or equal to nums[i]
                // will be removed suppose stack has 4 5 1 now we got 2 
                // 4 and 5 will be removed then we will get smaller total number 
                stack.pop();
                k--;
            }
            // not to push the leading 0s as leading is non zero 
            if(!(c=='0' && stack.isEmpty())){
              stack.push(c);
            }
       }

       // k is still > 0 
       // remove the last k element that is top of stack 
       while(k>0 && !stack.isEmpty()
       ){
        char popValue=stack.pop();
        k--;
       }

       while(!stack.isEmpty()){
         char popValue=stack.pop();
           sb.append(popValue);
       }

       sb=sb.reverse();
       // remove all leading zeroes
       for(int i=0;i<sb.length();i++){
            char c=sb.charAt(i);
            if(c!='0'){
                // means first non zero found break;
                break;
            }
            // remve leading zeroes
            sb.deleteCharAt(i);
       }

        // if after k remvoal nothing remains 
       return sb.length()==0?"0":sb.toString();

    }
}