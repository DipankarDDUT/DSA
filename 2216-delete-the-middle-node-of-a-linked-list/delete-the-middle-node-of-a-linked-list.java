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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        // as asking if even number of nodes then fast will stop at second
        // last node
        // means even number of nodes
        if (fast.next != null) {
            // slow will point before the node to be removed 
            slow.next = slow.next.next;
        } else {
            prev.next = prev.next.next;
        }

        return head;
    }
}