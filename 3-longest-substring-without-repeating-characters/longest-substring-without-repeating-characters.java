class Solution {
    public int getMax(int max1,int max2){
        if(max1>max2){
            return max1;
        }

        return max2;
    }
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1){
            return s.length();
        }
        int maxLength=Integer.MIN_VALUE;
        HashMap<Character,Integer> preMap=new HashMap<>();
        int low=0; // to keep track of sliding window left
        int right=0; // to keep track of sliding window right  
        // int si=0; // string index
        while(low<=right && right<s.length() ){
            if(!preMap.containsKey(s.charAt(right))){
                // map doesn't contain add to map
                preMap.put(s.charAt(right),right);
                right++;
                
            }else{
                // means it contains 
                // get the maxLength 
                maxLength=getMax(maxLength,(right-low));
                System.out.println(maxLength);
                // then find the index 
                int getIndex=preMap.get(s.charAt(right));
                // now check suppose low is already bigger than existing then ignore
                if(getIndex>=low){
                low=getIndex+1;

                }
                // next low must be next to getIndex
                preMap.put(s.charAt(right),right);

                if(right<low){
                    right=low;
                }else{
                    right++;
                }
                // update the current in preMap with new duplicate index so that prev one get over written
            }
            // right++;
        }

        // one use case where there is no repeating character at all low at 0 right at last index + 1 
        if(low==0 && right==s.length()){
            return s.length();
        }
        if(maxLength<right-low){
            return right-low;
        }
        return maxLength;
    }
}