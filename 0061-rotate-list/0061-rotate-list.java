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
      ListNode itr = head;
      int size =0;
      while(itr!=null){
        size++;
        itr = itr.next;
      }
      if(size>0)
      k = k%size;
        while(k-->0){
        ListNode temp = head;
        ListNode prev = head;
        if(temp!=null){
        while(temp.next!=null){
            prev = temp;
            temp=temp.next;
        }
        temp.next = head;
        prev.next = null;
        head = temp;
        }
        }
         return head;
    }
   
}