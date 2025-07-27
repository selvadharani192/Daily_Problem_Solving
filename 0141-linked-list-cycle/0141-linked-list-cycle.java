/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       ListNode slowPointer = head;
       ListNode fastPointer = head;

       while(slowPointer!=null){
        slowPointer=slowPointer.next;
        if(fastPointer!=null&&fastPointer.next!=null){
        fastPointer=fastPointer.next.next;
        }
        else{
           fastPointer=head; 
        }
        if(slowPointer==fastPointer){
            return true;
        }
       }
               return false;

    }
}