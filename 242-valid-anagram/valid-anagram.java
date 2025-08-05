class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] arrayMap=new int[26];
        if(s.length()!=t.length() || s.length()<1){
            return false;
        }

        for(int i=0; i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            arrayMap[sChar-'a']+=1;
            arrayMap[tChar-'a']-=1;
        }

        for(int num:arrayMap){
            if(num!=0){
                return false;
            }
        }

        return true;


    }
}