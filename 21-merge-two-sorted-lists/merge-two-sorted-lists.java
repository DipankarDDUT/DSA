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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode result=null;
        ListNode prev=null;
        if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }else if(list1==null && list2==null){
            return null;
        }

        ListNode l1=list1;
        ListNode l2=list2;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                prev=l1;
                l1=l1.next;
            }else{
                //  3 case 
                //1 ->l2 need to added at head
                // 2 anywhere
                //āt tail
                ListNode newNode=new ListNode(l2.val);

                if(l1==list1){
                    //head
                        newNode.next=list1;
                        list1=newNode;
                        prev=newNode;
                  }else{
                    //tail
                        prev.next=newNode;
                        newNode.next=l1;
                        prev=newNode;


            }
                        l2=l2.next;

        }
    }

    while(l2!=null){
             ListNode newNode=new ListNode(l2.val);
             prev.next=newNode;
             prev=newNode;
             l2=l2.next;
    }

    return list1;
}
}