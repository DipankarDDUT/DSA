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
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null||head.next==null){
            return head;
        }
        int index=1;
        ListNode cur=head.next.next;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=even;
        even.next=null;
        odd.next=null;


        while(cur!=null){
            if(index%2==1){
                //odd
                odd.next=cur;
                odd=cur;
            }else{
                even.next=cur;
                even=cur;
            }
            ListNode temp=cur;
            cur=cur.next;
            temp.next=null;
            index++;
        }

        odd.next=evenHead;
        return head;

    }
}