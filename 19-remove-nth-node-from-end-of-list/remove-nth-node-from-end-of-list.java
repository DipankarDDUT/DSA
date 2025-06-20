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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        

        if(head==null){
            return null;
        }

 

        ListNode fast=head;
        ListNode slow=head;
        // fast will move based on N 
        int i=0;
        while(i<n && fast!=null){
            fast=fast.next;
            i++;
        }
        if(fast==null){
            //means fast reached last node 1 st index have to be removed
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        System.out.println(slow.val);
        // if(slow==head){
        //      head=head.next;
        //      return head;
          
        // }
        slow.next=slow.next.next;
        return head;



     
     

    }
}