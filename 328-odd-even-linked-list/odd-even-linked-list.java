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

        if (head == null || head.next == null) {
            return head;
        }
        ListNode currentOdd = null;
        ListNode currentEven = null;
        ListNode oddH = null;
        ListNode evenH = null;
        int i = 1;
        ListNode temp = head;
        while (temp != null) {
            ListNode next = temp.next;
            if (i % 2 == 1) {
                if (oddH == null) {
                    oddH = temp;
                    currentOdd = temp;
                } else {
                    currentOdd.next = temp;
                    currentOdd = temp;
                }
                currentOdd.next = null;
            } else {
                if (evenH == null) {
                    evenH = temp;
                    currentEven = temp;
                } else {
                    currentEven.next = temp;
                    currentEven = temp;
                }
                currentEven.next = null;
            }
            temp = next;
            i++;
        }

        if (oddH != null) {
            currentOdd.next = evenH;
            return oddH;
        }

        currentEven.next = oddH;
        return evenH;

    }
}