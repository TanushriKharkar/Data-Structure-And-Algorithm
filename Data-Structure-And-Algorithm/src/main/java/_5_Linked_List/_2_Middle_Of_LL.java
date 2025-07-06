package _5_Linked_List;

public class _2_Middle_Of_LL {
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {

        if(head == null || head.next == null)    {
            return head;
        }

        ListNode small = head;
        ListNode big = head;

        while(big != null && big.next != null)  {
            small = small.next;
            big = big.next.next;
        }

        return small;
    }

    // Helper method to print the list from a given node
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" → ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String args[])  {
        _2_Middle_Of_LL obj = new _2_Middle_Of_LL();

        // Create linked list: 1 → 2 → 3 → 4 → 5
        ListNode n1 = obj.new ListNode(1);
        n1.next = obj.new ListNode(2);
        n1.next.next = obj.new ListNode(3);
        n1.next.next.next = obj.new ListNode(4);
        n1.next.next.next.next = obj.new ListNode(5);

        System.out.print("Original List: ");
        obj.printList(n1);

        ListNode middle = obj.middleNode(n1);
        System.out.println("Middle Node Value: " + middle.val); // Should print 3
    }
}
