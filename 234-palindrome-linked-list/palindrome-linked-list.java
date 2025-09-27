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
    /** 
        returns the head of the reverse list thatis lastNode
    */
    public ListNode reverseList(ListNode head) {

        ListNode slow = head;

        ListNode prevNode = null;

        while (slow != null) {
            ListNode nextNode = slow.next;
            slow.next = prevNode;
            prevNode = slow;
            slow = nextNode;
        }

        return prevNode;

    }

    public boolean isPalindrome(ListNode head) {

        // brtue will be using stack first traversal 
        // store all the elements in stack 
        // next iteration lastnode will be compared with
        // firstNode

        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow will reach exactly middle incase of odd and even second middle we want there so correct



        ListNode lastNode = reverseList(slow);
        slow = head;
        // (slow and lastNode) in parallel, the extra middle node in odd length lists won’t cause a mismatch.
        while (slow != null && lastNode != null) {

            if (slow.val != lastNode.val) {
                return false;
            }
            slow = slow.next;
            lastNode = lastNode.next;
        }

        return true;

    }
}