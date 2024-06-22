import java.util.*;
class MyQueue {

    int cur;
    Stack<Integer> st=new Stack<>(); 
    Stack<Integer> stBackUp=new Stack();
    public MyQueue() {
        cur=0;
    }
    
    public void push(int x) {
        while(!st.isEmpty()){
            stBackUp.push(st.pop());
        }
        st.push(x);
         while(!stBackUp.isEmpty()){
            st.push(stBackUp.pop());
        }
    }
    
    public int pop() {
        if(st.isEmpty()){
            return -1;
        }
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */