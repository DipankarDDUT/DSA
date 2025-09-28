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
    public ListNode sortList(ListNode head) {
    // Brute take arraylist
    // add all elements to arraylist
    // sort the arraylist
    // then assign all from arraylist to LinkedList

    // Optimal

    // Basically merge sort for linkedList
    // leep on narrow on left and left posible and backtract to get right right until not sorted
    if (head == null || head.next == null) {
      return head;
    }
    // break the list get the middle node
    ListNode midNode = getMid(head);
    // store the next of middle node for right iteration
    ListNode right = midNode.next;
    midNode.next = null; // cut the list
    // left iteration
    ListNode leftSorted = sortList(head);
    // right iteration
    ListNode rightSorted = sortList(right);
    // merge
    ListNode result = merge(leftSorted, rightSorted);
    return result;
  }

  private ListNode getMid(ListNode head) {

    // for two elements only if fast start from head then
    // slow goes to 2nd elemnt then complete taken be left
    // it goes forever
    ListNode slow = head;
    ListNode fast = head.next;
    while (fast != null && fast.next != null) {

      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;
  }

  private ListNode merge(ListNode left, ListNode right) {

    ListNode leftNode = left;
    ListNode rightNode = right;
    ListNode result;
    ListNode newNode = new ListNode(-1);
    result = newNode;
    while (leftNode != null && rightNode != null) {
      if (leftNode.val <= rightNode.val) {
        result.next = leftNode;
        leftNode = leftNode.next;
      } else {
        result.next = rightNode;
        rightNode = rightNode.next;
      }
      result = result.next;
    }

    if (leftNode != null) {
      result.next = leftNode;
    } else {
      result.next = rightNode;
    }

    return newNode.next;
  }
}