class MyLinkedList {

    Node head;
    int size;

    private class Node{
        Node next;
        int data;

        Node(int val){
            data=val;
            next=null;
        }
    }
    public MyLinkedList() {
        head=null;
        size=0;
    }
    
    public int get(int index) {
        if(size<=0||size<index+1){
            return -1;
        }
        Node temp=head;
        int pt=0;
        while(temp!=null && pt!=index){
            temp=temp.next;
            pt++;
        }
        if(temp!=null){
            return temp.data;
        }

        return -1;
        
    }

    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
        size++;
        
    }
    
    public void addAtTail(int val) {
        
        if(size==0){
            addAtHead(val);
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        Node newNode=new Node(val);
        temp.next=newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
         if(size<0||size<index){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }

        Node newNode=new Node(val);
        int pt=0;
        Node temp=head;
        while(temp!=null && pt+1!=index){
            temp=temp.next;
            pt++;
        }

        Node temp2=temp.next;
        temp.next=newNode;
        newNode.next=temp2;
        size++;

    }

    public void print(Node temp){
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    
    public void deleteAtIndex(int index) {
        // as index is 0 based
        if(size<=0||size<index+1){
            return;
        }
        print(head);

        int pt=0;
        Node temp=head;
        if(index==0  && size>0){
            head=head.next;
            return;
        }
        while(temp!=null){

            if(pt+1==index){
                if(temp.next.next!=null){
                    Node temp2=temp.next.next;
                    temp.next=temp2;
                }else{
                    temp.next=null;
                }
                size--;
                return;
            }
            temp=temp.next;
            pt++;
        }


    }
}

