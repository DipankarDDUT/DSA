class Solution {
    // public void shift(int[] arr,int start){

    //     for(int i=arr.length-1;i>start;i--){
    //         arr[i]=arr[i-1];
    //     }
    // }



    public void duplicateZeros(int[] arr) {
        

        int[] result=new int[arr.length];
        int right=arr.length-1;
        int left=0;
        int i=0;
        while(left<=right && i<arr.length){
            if(arr[left]==0){
                result[i++]=0;
                if(i<arr.length){
                  result[i++]=0;
                }
                left++;
                right--;
            }else{
                result[i++]=arr[left++];
            }
        }

          for(int k=0;k<arr.length;k++){
            arr[k]=result[k];
          }      

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0){
        //         shift(arr,i+1);
        //         if(i<arr.length-1){
        //         arr[i+1]=0;
        //         // as next have been added so increment i
        //         i++;

        //         }
        //     }
        // }
    }
}