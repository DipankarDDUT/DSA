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
    private void printList(ListNode head){

        ListNode temp=head;
           while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
            System.out.println();

    }
    private ListNode reverseList(ListNode head){

        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }

        return prev;

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // ListNode revl1=reverseList(l1);
        // printList(revl1);
        // ListNode revl2=reverseList(l2);
        // printList(revl2);
        
         ListNode revl1=l1;
        // printList(revl1);
         ListNode revl2=l2;
        // printList(revl2);

        ListNode result=null;
        ListNode rCur=null;

        // now addition 
        int carry=0;
        while(revl1!=null && revl2!=null){
            int sum=carry+revl1.val+revl2.val;
            if(sum>=10){
                carry=1;
            }
            else{
                carry=0;
            }
            sum=sum%10;
            ListNode newNode=new ListNode(sum);
            if(result==null){
                result=newNode;
                rCur=result;
            }else{
                rCur.next=newNode;
                rCur=newNode;
            }
            revl1=revl1.next;
            revl2=revl2.next;
        }

        while(revl1!=null){
           int sum=carry+revl1.val;
           if(sum>=10){
                carry=1;
            }else{
                carry=0;
            }
            sum=sum%10;
             ListNode newNode=new ListNode(sum);
              rCur.next=newNode;
              rCur=newNode;
              revl1=revl1.next;

        }
        while(revl2!=null){
           int sum=carry+revl2.val;
           if(sum>=10){
                carry=1;
            }else{
                carry=0;
            }
            sum=sum%10;
             ListNode newNode=new ListNode(sum);
              rCur.next=newNode;
              rCur=newNode;
              revl2=revl2.next;

        }
        printList(result);
        if(carry>0){
             ListNode newNode=new ListNode(1);
              rCur.next=newNode;
              rCur=newNode;
        }

        // result=reverseList(result);
        return result;
    }
}