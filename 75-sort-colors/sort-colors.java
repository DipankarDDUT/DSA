class Solution {
    public void sortColors(int[] nums) {
        

            int red=0;
            int white=0;
            int size=nums.length-1;
            int blue=size;

            while(white<=blue){
                if(nums[white]==0){
                    //next will be always be pointing to 1 other than when in index as 0 
                    // as ot will be on next pointer 
                  int temp=nums[white];
                    nums[white]=nums[red];
                    nums[red]=temp;
                    white++;
                    red++;

                }else if(nums[white]==1){
                    white++;
                }else{
                    //its 2
                        // here white ++ or -- cannot as not sure what just swap can be 0 
                        // but for when 0 then ofcourse previous is 1 or 0
                   int  temp=nums[white];
                    nums[white]=nums[blue];
                    nums[blue]=temp;
                    blue--;
                }
            }



    }
}