/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        int length=0;
        ListNode temp=head;
        ListNode tail=null;
        if(head==null||head.next==null){
            return head;
        }
        while(temp!=null){
            if(temp.next==null){
                tail=temp;
            }
            temp=temp.next;
            length++;
        }
         k=k%length;
        if(k==length||k==0){
            return head;
        }
       
        int limit=length-k;
        int i=1;
        temp=head;
        while(i<limit){
            temp=temp.next;
            i++;
        }

        ListNode next=temp.next;

        temp.next=null;
        tail.next=head;
        head=next;


        return head;





        
    }
}