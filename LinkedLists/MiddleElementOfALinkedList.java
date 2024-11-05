public class MiddleElementOfALinkedList {
    public int solve(ListNode A) {
        ListNode slowPointer=A;
        ListNode fastPointer=A;
        while(fastPointer!=null&&fastPointer.next!=null)
        {
            fastPointer=fastPointer.next.next;
            slowPointer=slowPointer.next;
           
        }
        return slowPointer.val;
    }
}
