class Solution {
    public void reverseString(char[] s) {
        int len=s.length-1;
        int i=0;
        while(i<len){
            char temp=s[i];
            s[i]=s[len];
            s[len]=temp;
            i++;
            len--;
        }
    }
}