class Solution {
    public int candy(int[] ratings) {
        if (ratings.length == 0)
            return 0;
        if (ratings.length == 1)
            return 1;

            // initial value
        int up = 0;
        int down = 0;
        int total = 1; // first already counted 
        int peak=0;
     
        for (int i = 1; i < ratings.length; i++) {
            // if equal no change in value of array 
            if (ratings[i] > ratings[i-1]) {
                up++;
                down=0;
                peak=up;
                total+=up+1;  // as up start from 0 first time up++ its 1 as bigger than previous so up +1 that is 2 for 2nd index if bigger than 1st index 
            }else if(ratings[i]==ratings[i-1]){
                up=0;
                down=0;
                peak=0;
                total+=1;
            }else{
                down++;
                up=0;
                total+=down;
                if(down>peak){ total+=1;} // bumping peak by 1
            }
        }
     
        return total;
    }
}
