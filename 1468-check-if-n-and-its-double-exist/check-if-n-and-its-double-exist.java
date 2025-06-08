class Solution {
    public boolean checkIfExist(int[] arr) {
        
        Set<Integer> preMap=new HashSet<>();
  
        for(int i=0;i<arr.length;i++){
            if(preMap.contains(arr[i]*2)||preMap.contains(arr[i]/2) && arr[i]%2==0){
                    return true;
            }else{
                preMap.add(arr[i]);
            }
        }

        return false;
    }
}