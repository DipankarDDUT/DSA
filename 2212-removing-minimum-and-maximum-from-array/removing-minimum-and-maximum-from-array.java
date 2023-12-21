class Solution {
    public int minimumDeletions(int[] nums) {
        
        if(nums.length<2){
            return 1;
        }else if(nums.length==2){
            return 2;
        }
        int fast=0;
        int slow=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                slow=i;
            }
            if(nums[i]>max){
                max=nums[i];
                fast=i;
            }
        }
        
        
        //tricky part is the removal of entries 
        
        //before slow/fast 1 
        // between slow/fast 2
        //after slow/fast 3 
        // example [2,10,7,5,4,1,8,6]
        int one=0;
        int two=0;
        int three=0;
        
        if(slow<fast){
            one=slow;
            three=nums.length-fast;
            two=fast-slow-1;
            
            if(one+two<one+three && one+two<three+two){
                
                return fast+1;
                
            }else if(three+one<three+two){
                // slow +1 as index start from 0 and slow also need to be removed 
                // nums.length-1 not beacause index start from 0
                return slow+1+ (nums.length-fast);
                
                
            }else{
            //three+ two
                
                return nums.length-slow;
                
            }
            
        } else{
        
 one=fast;
            three=nums.length-slow;
            two=slow-fast-1;
            
            if(one+two<one+three && one+two<three+two){
                
                return slow+1;
                
            }else if(three+one<three+two){
                
                return fast+1+ (nums.length-slow);
                
                
            }else{
            //three+ two
                
                return nums.length-fast;
                
            }
        }
        
        
    }
}