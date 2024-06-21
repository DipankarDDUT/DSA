import java.util.Queue;
import java.util.ArrayDeque;

// implementation using ArrayDeque
// class MyStack {
//     Queue<Integer> queue1=new ArrayDeque<>();
//     // Queue<Integer> queue2=new ArrayDeque<>();
//     int currSize;
//     int top;
//     public MyStack() {
//         currSize=0;
       
//     }
    
//     public void push(int x) {

       
//         queue1.offer(x);
//         currSize++;
//     }
    
//     public int pop() {
//         // two queue requires but ArrayDeque provides method that can 
//         //be done using single queue itself;
//         // if not then push all from queue1 to queue2 until curSize==1; 
//         // whatever left pop it and again transfer back to queue1 increasing the currSize  as  well
//         if(queue1.size()>0){
//             // casting is required as Queue doesnot provide this methods 
//             int temp= ((ArrayDeque<Integer>) queue1).removeLast();
//             currSize--;
//             return temp;
//         }
//         return -1;

       
//     }
    
//     public int top() {
//         if(queue1.size()>0){

//                 return ((ArrayDeque<Integer>) queue1).getLast();
               
//         }
//         return -1;
//     }
    
//     public boolean empty() {
//         if(currSize==0){
//             return true;
//         }
//         return false;
//     }
// }


class MyStack {
    Queue<Integer> queue1=new ArrayDeque<>();
    int currSize;
    int top;
    public MyStack() {
        currSize=0;
        top=-1;
       
    }
    
    public void push(int x) {


        queue1.offer(x);
        currSize++;
        // with every push reverse the order
        // -1 leaving the current element as it needs to be in the bottom that i top for queue
       for(int i=0;i<currSize-1;i++){
            queue1.offer(queue1.poll());
       }
        
        
    }
    
    public int pop() {
        if(queue1.size()>0){
            int temp= queue1.poll();
            currSize--;
            return temp;
        }
        return -1;

       
    }
    
    public int top() {
        if(queue1.size()>0){

                return ((ArrayDeque<Integer>) queue1).getFirst();
               
        }
        return -1;
    }
    
    public boolean empty() {
        if(currSize==0){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */