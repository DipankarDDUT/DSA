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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode temp=head;
        ListNode prev=null;

        while(temp!=null){
            if(temp==head && temp.val==val){
                head=head.next;
                temp=head;
                prev=null;
                continue;
            }
            else if(temp.val==val){
                if(temp.next==null){
                    prev.next=null;
                    break;
                }else{
                    temp=temp.next;
                    prev.next=temp;
                    continue;
                }
            }
            prev=temp;
            temp=temp.next;
        }

        return head;
    }
}