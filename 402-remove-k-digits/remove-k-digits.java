class Solution {
    public String removeKdigits(String num, int k) {
        

        // // lets assume its continuous  solution will work only 
        // for continuos removal of number
        // // we will take group of k starting from index 0 to find the largest and remove it 
        // int max=Integer.MIN_VALUE;
        // int starting=0;
        // int ending=0;
        // for(int i=0;i<num.length()-k+1;i++){
        //     int tempNum=Integer.parseInt(num.substring(i,i+k));
        //     if(tempNum>max){
        //         max=tempNum;
        //         starting=i;
        //         ending=i+k;
        //     }
        //     if(i<num.length()-k && num.charAt(k)=='0' && i==0){
        //         max=tempNum*10;
        //     }
        // }
        // // StringBuilder sb=new StringBuilder();
        // String result=num.substring(0,starting)+num.substring(ending);
        // System.out.println(result);

        // // remove all leading 0s
        // StringBuilder sb=new StringBuilder(result); 
        // while(sb.length()>0 && sb.charAt(0)=='0'){
        //     sb.deleteCharAt(0);
        // }
        // result=sb.toString();
        // return result.length()==0?"0":result;

        // Algorithm : 
        // empty stack check if at index character 0 skip else push
        // if curr element is smaller than peek then keep on removing elemenet
        // from stack until k>0 && current element < peek()
        if(num.length()==1 && k==1){
            return "0";
        }
            Stack<Character> st=new Stack<>();
            int tempK=k;
            for(int i=0;i<num.length();i++){

                  while(!st.isEmpty() && num.charAt(i)<st.peek() && tempK>0){
                            st.pop();
                            tempK--;
                        }
                if(!st.isEmpty() || num.charAt(i)!='0'){
                    // if not empty simply push the current after chcekign and removing 
                    // or curr is not 0
                        st.push(num.charAt(i));
                }
            }

            while(tempK>0 && !st.isEmpty()){
                st.pop();
                            tempK--;  
            }

             StringBuilder sb=new StringBuilder();
             while(!st.isEmpty()){
                sb.append(st.pop());
             }

             return sb.length()==0?"0":sb.reverse().toString();
    }
}