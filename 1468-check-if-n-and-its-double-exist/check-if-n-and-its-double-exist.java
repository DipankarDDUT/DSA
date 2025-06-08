class Solution {
    public boolean checkIfExist(int[] arr) {
        
        HashMap<Integer,Integer> preMap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            preMap.put(arr[i],i);
        }

        for(int i=0;i<arr.length;i++){
            if(preMap.containsKey(arr[i]*2)){
                if(preMap.get(arr[i]*2)!=i){
                    return true;
                }
            }
        }

        return false;
    }
}