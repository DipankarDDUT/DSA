class Solution {
    public int strStr(String haystack, String needle) {
        

        int i=0;
        int j=0;
        if(haystack.length()<needle.length()){
            return -1;
        }
        while(i<haystack.length()){

                if(needle.charAt(j)==haystack.charAt(i)){
                    int result=i;
                    int k=i;
                while(j<needle.length() && k<haystack.length() && needle.charAt(j)==haystack.charAt(k)){
                    System.out.print(haystack.charAt(k));
                    j++;
                    k++;
                }
                if(j==needle.length()){
                    System.out.println();
                    return result;
                }else{
                    System.out.println();
                    j=0;
                }
                    i++;
                }else{
                    i++;
                }

            
        }

        return -1;
    }
}