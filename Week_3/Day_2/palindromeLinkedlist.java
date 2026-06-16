package Week_3.Day_2;

public class palindromeLinkedlist {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
   
    public boolean isPalindrome(ListNode head) {
      ListNode mid= head;
      ListNode last=head;
      while(last.next!=null&&last.next.next!=null)
      {
        mid=mid.next;
        last=last.next.next;
      }  
      ListNode rev=reverse(mid.next);

      ListNode curr=head;
       
      while(rev!=null)
      {
        if(rev.val!=curr.val)return false;
        curr=curr.next;
        rev=rev.next;
      }
      return true;
    }
     private ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}

