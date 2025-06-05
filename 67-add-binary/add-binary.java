class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder st=new StringBuilder();
        int carry=0;
        int sum=0;
            while(i>=0 || j>=0){
                sum=carry;
                if(i>=0){
                   sum+=a.charAt(i)-'0';
                }
                if(j>=0){
                     sum+=b.charAt(j)-'0';
                }
                st.append(sum%2);
                carry=sum/2;
                System.out.println(sum+"\t"+carry);
                i--;
                j--;
                
            }

            if(carry>0){
                st.append(carry);
            }

        

        return st.reverse().toString();
    }
}