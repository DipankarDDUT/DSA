class Solution {
    public int[] asteroidCollision(int[] asteroids) {
          Stack<Integer> st=new Stack<>();
        if(asteroids.length==0){
            return new int[0];
        }
        if(asteroids.length==1){
            return new int[]{asteroids[0]};
        }

        for(int asteroid : asteroids){

            if(asteroid>0){
                // moving to the right always push 
                st.push(asteroid);
            }else{
                // new one coming moving to the left
                while(!st.isEmpty() && st.peek()>0 && Math.abs(asteroid)>st.peek()){
                    // destroy all smaller moving to the right
                    st.pop();
                }
                // all smaller destroyed , now will check for equal and opp
               if(!st.isEmpty() && st.peek()>0 && Math.abs(asteroid)==st.peek()){
                    st.pop();

               }else if(st.isEmpty()||st.peek()<0){
                // either empty or top one moving to the left same direction 
                st.push(asteroid);
               }
            }
        }
          

        int[] result=new int[st.size()];
         int i=st.size()-1;
         while(i>=0){
            result[i]=st.pop();
            i--;
         }
         return result;
    }
}