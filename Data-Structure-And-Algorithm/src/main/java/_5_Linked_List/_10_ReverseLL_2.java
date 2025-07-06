package _5_Linked_List;

public class _10_ReverseLL_2 {

     // Definition for singly-linked list.
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


     public ListNode reverseBetween(ListNode head, int left, int right) {
         //time complexity => O(n)
         //space complexity => O(1)

         //create a dummy node to mark head pf this list
         ListNode dummy = new ListNode(0);
         dummy.next = head;

         //make markers for currNode & for the node before reversing
         ListNode leftPre = dummy;
         ListNode currNode = head;

         for(int i=0; i< left-1; i++)    {
             leftPre = leftPre.next;
             currNode = currNode.next;
         }

         //make a marker to node where we start reversing
         ListNode subListHead = currNode;

         ListNode preNode = null;
         for(int i=0; i<= right-left; i++)   {
             ListNode nextNode = currNode.next;
             currNode.next = preNode;
             preNode = currNode;
             currNode = nextNode;
         }

         //join the pieces
         leftPre.next = preNode;
         subListHead.next = currNode;

         return dummy.next;

     }

    // Helper to create a list from array
    public ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper to print list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String args[])  {
        _10_ReverseLL_2 obj = new _10_ReverseLL_2();

        // Optimized sample input
        int[] arr = {1, 2, 3, 4, 5};
        int left = 2, right = 4;

        ListNode head = obj.createList(arr);

        System.out.println("Original list:");
        obj.printList(head);

        // Reverse sublist from position 2 to 4
        ListNode modified = obj.reverseBetween(head, left, right);

        System.out.println("Reversed list (positions " + left + " to " + right + "):");
        obj.printList(modified);
    }
}
