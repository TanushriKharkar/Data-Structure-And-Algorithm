package _5_Linked_List;

public class _1_ReverseLL {
    
    //  Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
     
   
      public ListNode reverseList(ListNode head) {

          if(head == null || head.next == null)   {
              return head;
          }

          ListNode newHead = reverseList(head.next);
          head.next.next = head;
          head.next = null;

          return newHead;
      }

    // Helper method to print the linked list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String args[])  {
        _1_ReverseLL obj = new _1_ReverseLL();

        // Creating the linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = obj.new ListNode(5);

        System.out.println("Original List:");
        obj.printList(head);

        // Reversing the linked list
        ListNode reversed = obj.reverseList(head);

        System.out.println("Reversed List:");
        obj.printList(reversed);
    }

}
