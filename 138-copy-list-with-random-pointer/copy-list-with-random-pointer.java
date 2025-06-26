/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        HashMap<Node,Node> listMap=new HashMap<>();

        if(head==null){
            return head;
        }
        Node result=new Node(head.val);
        Node cur=result;
        listMap.put(head,result);
        Node temp=head.next;
        while(temp!=null){
             Node newNode=new Node(temp.val);
             listMap.put(temp,newNode);
             cur.next=newNode;
             cur=newNode;
             temp=temp.next;
        }

        temp=head;
        cur=result;
        while(temp!=null){
            if(temp.random!=null){
                cur.random=listMap.get(temp.random);
            }
            temp=temp.next;
            cur=cur.next;
        }


        return result;
    }
}