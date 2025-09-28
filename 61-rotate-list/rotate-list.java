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

  public ListNode rotateRight(ListNode head, int k) {

    if (head == null) {
      return null;
    }
    ListNode curNode = head;
    ListNode prev = null; // to help getting the lastNode will
    int size = 0;
    while (curNode != null) {
      prev = curNode;
      curNode = curNode.next;
      size++;
    }
    k = k % size;
    if (k == size || k == 0) return head;
    curNode = head;

    // will reach  node befor k
    int i = 1;
    while (curNode != null && i < size-k) {
      curNode = curNode.next;
      i++;
    }
    if (curNode == null) return head;
    ListNode newHead = curNode.next; // get the newhead;
    curNode.next = null; // to break the chain between k-1 and k
    // simply point the last node to current head

    prev.next = head;
    head = newHead;

    return head;
  }
}
