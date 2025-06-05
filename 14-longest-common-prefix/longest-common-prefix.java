class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        int minIndex=-1;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
                minIndex=i;
            }
        }
        String longest="";

      for(int j=0;j<strs[minIndex].length();j++){


      } 

     for(int j=0;j<strs[minIndex].length();j++){
                boolean flag=true;
                String compare=strs[minIndex].substring(0,strs[minIndex].length()-j);
                System.out.println(compare);
            for(int i=0;i<strs.length;i++){
                
                if(!strs[i].startsWith(compare)){
                    flag=false;
                    break;
                }
            

        }
        if(flag){
            return compare;
        }
     }   
   

        return longest;
    }
}