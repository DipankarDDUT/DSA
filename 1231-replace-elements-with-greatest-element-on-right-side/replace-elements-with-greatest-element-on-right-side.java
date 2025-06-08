class Solution {
    public int[] replaceElements(int[] arr) {

        if(arr.length==0){
            return arr;
        }
        int greatest=arr[arr.length-1];
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>greatest){
                int prev=greatest;
                greatest=arr[i];
                arr[i]=prev;
            }else{
                arr[i]=greatest;
            }
        }

        return arr;
    }
}