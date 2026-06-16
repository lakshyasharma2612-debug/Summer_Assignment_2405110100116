package Week_3.Day_2;



public class nthNode {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
        public ListNode removeNthFromEnd(ListNode head, int n) {
       
        ListNode dumm=new ListNode(0);
        dumm.next=head;
         ListNode f=dumm;
         ListNode temp=dumm;
         for(int i=0;i<n+1;i++)
         {
            f=f.next;
         }
         
        while(f!=null)
        {
            temp=temp.next;
            f=f.next;
        }
       temp.next=temp.next.next;
        return dumm.next;
    }
}

