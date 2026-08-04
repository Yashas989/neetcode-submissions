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
    public ListNode reverseList(ListNode head) {
         if(head == null)
                  return null;
              ListNode prev = null;
              ListNode tempNode = null;
              while(head.next!=null){
                  tempNode = head;
                  head = head.next;
                  tempNode.next = prev;
                  prev = tempNode;
              }
              head.next = prev;
              return head;
          
    }
}
