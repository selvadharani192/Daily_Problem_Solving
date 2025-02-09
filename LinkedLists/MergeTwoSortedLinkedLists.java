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
      
       ListNode sortedList=new ListNode();
       ListNode traversor=sortedList;
       
       while(list1!=null&&list2!=null)
       {
          if(list1.val<list2.val)
          {
            traversor.next=list1;
            traversor=list1;
            list1=list1.next;
          }
          else
          {
         traversor.next=list2;
                     traversor=list2;
            list2=list2.next;
          }         
          
       }
       if(list1!=null)
       {
        traversor.next=list1;
       }
       if(list2!=null)
       {
        traversor.next=list2;
       }
      return sortedList.next;
    }
}
