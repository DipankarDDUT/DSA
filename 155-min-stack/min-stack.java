class MinStack {

  //Formula 2 * val - previousMinimum=new_Val 
  // top =>min no modified value
  // top<min modified value use formula always return the minimum 
  // 2 * val - newVal(which is in top)= previousMinimim
  // 
  Stack<Long> stack;
  long min;

  public MinStack() {
    stack = new Stack<>();
  }

  public void push(int val) {
    if (stack.isEmpty()) {
      stack.push((long)val);
      min=val;
      return;
    }
    if(min<=val){
      // simply push the element
       stack.push((long)val);
    }else{
      // get the new value
      long new_value=(2L * val) - min;
      min=val;
      stack.push(new_value);
    }
  }

  public void pop() {
    if (!stack.isEmpty()) {
      long x=stack.pop();
      // now we will see x was modified value or not
      // as we dont know whether minimum was removed 
      if(x<min){
        // min larger means x was modified we need to get the 
        // previous minimum
        min=2L * min - x;
      }
    }
  }

  public int top() {
    if (!stack.isEmpty()){
      if(stack.peek()>=min){
        // exact number was pushed 
        long temp=stack.peek();
        return (int)temp;
      }else{
        return (int)min;
      }
    } 
    return -1;
  }

  public int getMin() {
    if (!stack.isEmpty()) {
      return (int)min;
    }
    return -1;
  }
}
