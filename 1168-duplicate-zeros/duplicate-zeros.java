class Solution {
    public void shift(int[] arr,int start){

        for(int i=arr.length-1;i>start;i--){
            arr[i]=arr[i-1];
        }
    }



    public void duplicateZeros(int[] arr) {
        

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                shift(arr,i+1);
                if(i<arr.length-1){
                arr[i+1]=0;
                // as next have been added so increment i
                i++;

                }
            }
        }
    }
}