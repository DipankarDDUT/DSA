class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            // if same direction simply  push
            int curNum = asteroids[i];
            boolean alive = true;
            if (stack.isEmpty()) {
                stack.push(curNum);
                // push and next iteration
                continue;
            }
            while (alive && !stack.isEmpty()) {

                // both left both right and stack top left and cur Right no issue
             if(stack.peek()>=0 && curNum<0) {
                    // collision
                    if (stack.peek() == Math.abs(curNum)){
                        //equal both destory no need 
                        stack.pop();
                        alive=false;
                    } 
                    else if(stack.peek() > Math.abs(curNum)) {
                        //  top is bigger curNum destroyed 
                        alive = false;
                    } else {
                        // curNum abs is bigger then top 
                        stack.pop();
                        if (stack.isEmpty()) {
                            // means curNum bigger than all 
                            stack.push(curNum);
                            alive = false;
                        }
                    }

                }else{
                    
                    stack.push(curNum);
                    alive = false;
                }
            }
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();

        }
        return result;
    }
}
