class MyLinkedList {

    private class Node{
        Node next;
        Node prev;
        int val;

        Node(int val){
            this.val=val;
            next=null;
            prev=null;
        }
    }
    Node head;
    int size;

    public MyLinkedList() {
        head=null;
        size=0;
    }


    
    public int get(int index) {
        // 
        if(index<0||index>=size){
            return -1;
        }

         int i=0;
         Node temp=head;
         while(temp!=null &&  i<index){
            temp=temp.next;
            i++;
         }

         if(temp!=null){
            return temp.val;
         }

         return -1;


    }
    
    public void addAtHead(int val) {
          

        Node newNode=new Node(val);
        if(size==0){
            head=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        size++;
    }
    
    public void addAtTail(int val) {

         Node newNode=new Node(val);
         if(head==null){
            addAtHead(val);
            return;
         }
         Node temp=head;
         while(temp.next!=null){
            temp=temp.next;
         }
         temp.next=newNode;
         newNode.prev=temp;
         size++;
         
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0||index>size){
              return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        System.out.println(index+"\tsize: "+size);
        if(index==size){
            addAtTail(val);
            return;
        }

         int i=0;
         Node temp=head;
         while(temp!=null &&  i<index){
            temp=temp.next;
            i++;
         }
         if(temp!=null){
            Node newNode =new Node(val);
            Node prev=temp.prev;
            prev.next=newNode;
            temp.prev=newNode;
            newNode.prev=prev;
            newNode.next=temp;
            size++;
         }


    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=size){
              return;
        }
        if(index==0){
            if(size==1){
                head=null;
            }else{
                 head=head.next;
                 head.prev=null;
            }
     
            size--;
            return;
        }



         int i=0;
         Node temp=head;
         while(temp!=null &&  i<index){
            temp=temp.next;
            i++;
         }
         if(temp!=null){

            if(temp.next==null){
               Node prev=temp.prev;
                temp.prev=null;
                prev.next=null;
                size--;
                return;
            }else{
               Node prev=temp.prev;
               Node next=temp.next;
               prev.next=next;
               next.prev=prev;
               temp.prev=null;
               temp.next=null;
               size--;
               return; 


            }

         }

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */