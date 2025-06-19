/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head==null||head.next==null){
            return null;
        }

        ListNode fast=head;
        ListNode slow=head;
        boolean loopExist=false;
         while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                loopExist=true;
                break;
            }
         }

         if(!loopExist){
            return null;
         }

         slow=head;
         System.out.println(fast.val);
         while(slow!=null){
            if(fast==slow){
                return slow;
            }
            fast=fast.next;
            slow=slow.next;
         }



         
      return null;

    }
}