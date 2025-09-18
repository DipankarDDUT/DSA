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
        ListNode fastp=head;
        // first go n steps 
        for(int i=0;i<n;i++){
            fastp=fastp.next;
        }

        if(fastp==null){
            // means head need to be remvoed 
            return head.next;
        }

        ListNode slowp=head;
        // .next as slopP need to be stop before the node to be removed 
        while(fastp.next!=null){
            slowp=slowp.next;
            fastp=fastp.next;
        }

        slowp.next=slowp.next.next;

        return head;

    }
}