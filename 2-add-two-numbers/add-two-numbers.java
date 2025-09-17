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
    public ListNode reverseLinkedList(ListNode head){
            if(head==null||head.next==null){
                return head;
            }
            ListNode cur=head.next;
            ListNode prev=head;
            prev.next=null;
            while(cur!=null){
                ListNode next=cur.next;
                cur.next=prev;
                prev=cur;
                cur=next;
            }

            return prev;

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // ListNode h1=reverseLinkedList(l1);
        // ListNode h2=reverseLinkedList(l2);
        ListNode result;
        int carry=0;
        ListNode cur=null;
        ListNode head=null;
        while(l1!=null || l2!=null){
            int sum=0;
            sum+=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum>9?1:0;
            sum=sum%10;
            ListNode newNode=new ListNode(sum);
            if(cur==null){
                cur=newNode;
                head=newNode;
            }else{
                cur.next=newNode;
                cur=newNode;
            }
            

        }

        if(carry>0){
               ListNode newNode=new ListNode(carry);
            if(cur==null){
                cur=newNode;
                head=newNode;
            }else{
                cur.next=newNode;
                cur=newNode;
            }
        }


        return head;

    }
}