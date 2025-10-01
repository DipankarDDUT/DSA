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
    public ListNode reverseKGroup(ListNode head, int k) {
        // if one element or no , return the head
        if (head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        head = dummy;
        int len = 0;
        ListNode curNode = head.next;
        while (curNode != null) {
            len++;
            curNode = curNode.next;
        }
        curNode = head.next;
        ListNode groupPrevNodeOfHead = head;

        //equal as len is 1 based goves exact number of elements 
        while (len >= k) {
            // head of the group before reversal
            ListNode lastHead = curNode;
            ListNode prevNode = null;

            // after reversal then only assign to prevNode 
            for (int i = 0; i < k; i++) {

                ListNode nextNode = curNode.next;
                curNode.next = prevNode;
                prevNode = curNode;
                curNode = nextNode;
            }

            // prevNode is pointitng to tail of reverse list
            // curNode pointing to start of new group

            // previous node to group should point to prevNode which is head now

            groupPrevNodeOfHead.next = prevNode;

            // now new prevnode of new group is last head before reversal
            groupPrevNodeOfHead = lastHead;

            len -= k;
        }

        // if k> len now left over need to be linked 
          groupPrevNodeOfHead.next = curNode;

        return dummy.next;
    }
}