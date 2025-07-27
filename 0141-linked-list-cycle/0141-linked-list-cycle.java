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
        HashSet<ListNode> set = new HashSet<ListNode>();
        ListNode traversor = head;
        while(traversor!=null){
            if(set.contains(traversor))
            {
                return true;
            }
            set.add(traversor);
          traversor=traversor.next;
        }
        return false;
    }
}