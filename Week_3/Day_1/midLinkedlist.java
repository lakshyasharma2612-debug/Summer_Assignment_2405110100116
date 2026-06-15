package Week_3.Day_1;

public class midLinkedlist {
    public ListNode middleNode(ListNode head) {
        ListNode mid = head;
        ListNode last = head;
        while (last.next!=null&&last.next.next!=null)
        {
            last = last.next.next;
            mid= mid.next;
        }
        if(last.next!=null){
            mid = mid.next;
        }
        return mid;
        
    }
}
