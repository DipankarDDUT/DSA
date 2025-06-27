class MyCircularQueue {

    int[] queue;
    int head;
    int tail;
    int size;

    public MyCircularQueue(int k) {
        queue=new int[k];
        head=-1;
        tail=-1;
        size=0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(tail==-1  && head==-1){
            head=0;
            tail=0;
            queue[tail]=value;
        }else{
            tail=(tail+1)%queue.length;
            queue[tail]=value;
        }
        size++;

        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        if (head == tail) {
            head = -1;
            tail = -1;
            size=0;
            return true;
        }
        head=(head+1)%queue.length;
        size--;
        return true;
    }
    
    public int Front() {
        if(size==0){
            return -1;
        }
        return queue[head];
    }
    
    public int Rear() {
        if(size==0){
            return -1;
        }
        return queue[tail];
    }
    
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(size==queue.length){
            return true;
        }

        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */