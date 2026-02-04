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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode head1 = new ListNode();
        head1.next = head;
        ListNode traversor = head1;
        ListNode prev=head1;
        head1.val=Integer.MIN_VALUE;
        while(traversor!=null&&traversor.next!=null){
             if(traversor.next.val==traversor.val){
             while(traversor!=null&&traversor.next!=null&&traversor.next.val==traversor.val){
                  traversor= traversor.next;
             }
             prev.next = traversor.next;
             traversor = traversor.next;
             }
             else{
             prev = traversor;
            traversor = traversor.next;
             }
            
        }
        return head1.next;
    }
}