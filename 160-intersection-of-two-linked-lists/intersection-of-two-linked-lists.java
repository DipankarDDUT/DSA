/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA==null||headB==null){
            return null;
        }
        ListNode temp=headA;
        int lenA=0;
        int lenB=0;
        while(temp!=null){
            lenA++;
            temp=temp.next;
        }
        temp=headB;
          while(temp!=null){
            lenB++;
            temp=temp.next;
        }

        if(lenA>lenB){
            int diff=lenA-lenB;
            while(diff!=0){
                headA=headA.next;
                diff--;
            }
        }else if(lenB>lenA){
             int diff=lenB-lenA;
            while(diff!=0){
                headB=headB.next;
                diff--;
            }
        }

        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }

        return null;
    }
}