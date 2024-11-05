
  class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
 
public class CheckLinkedListIsPalindroome {
    public int isPalindrome(ListNode A) {
        ListNode slowPointer=A;
        ListNode fastPointer=A;
      // bring the slow pointer upto mid of the linked list
        while(fastPointer!=null&&fastPointer.next!=null)
        {
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }
       
         ListNode reverseTraversor=A;
         ListNode prev=null;
         ListNode temp=null;
      //reverse the linked list before slow pointer
      // for odd slow pointer will be mid and for even slow pointer will be second half's first element , so slow pointer is ignored
         while(reverseTraversor!=slowPointer)
         {
            temp=reverseTraversor.next;
            reverseTraversor.next=prev;
            prev=reverseTraversor;
            reverseTraversor=temp;
         }
        // if the linked list size if odd fast pointer will not be null , to ignore mid element have done this
         if(fastPointer!=null)
         {
             slowPointer=slowPointer.next;
         }

      // traverse the first half and second and check 
        while(slowPointer!=null)
        {
            if(prev.val!=slowPointer.val)
            {
                return 0;
            }
            prev=prev.next;
            slowPointer=slowPointer.next;
        }
      // need to reverse the first part again same logic
         return 1;
    }
}
