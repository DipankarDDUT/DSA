class Solution {
    public boolean validMountainArray(int[] arr) {
        

        boolean increasing=false;
        boolean decreasing=false;
        if(arr.length<2){
            return false;
        }
        
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                if(decreasing){
                    return false;
                }
                increasing=true;
         
            }else if(arr[i-1]>arr[i]){
                if(!increasing){
                    //direct decreasing without increase false;
                    return false;
                }
                decreasing=true;
       
            }else{
                //equals 
                return false;
            }
        }

        // check always incrasing no decrease
        return decreasing?true:false;
    }
}