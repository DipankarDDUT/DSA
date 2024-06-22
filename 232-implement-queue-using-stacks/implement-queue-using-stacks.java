import java.util.*;
// class MyQueue {

//     int cur;
//     Stack<Integer> st=new Stack<>(); 
//     Stack<Integer> stBackUp=new Stack();
//     public MyQueue() {
//         cur=0;
//     }
    
//     // here push operation is O(n)  we can do better can make it O(1) like pop operation and peek operation 
//     public void push(int x) {
//         while(!st.isEmpty()){
//             stBackUp.push(st.pop());
//         }
//         st.push(x);
//          while(!stBackUp.isEmpty()){
//             st.push(stBackUp.pop());
//         }
//         cur++;
//     }
    
//     public int pop() {
//         if(st.isEmpty()){
//             return -1;
//         }
//         return st.pop();
//     }
    
//     public int peek() {
//         return st.peek();
//     }
    
//     public boolean empty() {
//         return st.isEmpty();
//     }

// }

// here pop may be O(n) or 1 if output empty than O(n) else 1 same for peek
class MyQueue {

    int cur;
    Stack<Integer> input=new Stack<>(); 
    Stack<Integer> output=new Stack();
    public MyQueue() {
        cur=0;
    }
    
    public void push(int x) {

        input.push(x);
        cur++;
    }
    
    public int pop() {
        if(input.isEmpty() && output.isEmpty()){
            return -1;
        }
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.pop();
    }
    
    public int peek() {
        if(!output.isEmpty()){
            return output.peek();
        }else{
            while(!input.isEmpty()){
                output.push(input.pop());
            }
              return output.peek();
        }
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
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