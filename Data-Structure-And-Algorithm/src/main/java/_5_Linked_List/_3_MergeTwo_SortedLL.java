package _5_Linked_List;

public class _3_MergeTwo_SortedLL {

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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode curr = head;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val)     {
                curr.next = list1;
                list1 = list1.next;
            }
            else    {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if(list1 != null)   {
            curr.next = list1;
        }
        else   {
            curr.next = list2;
        }

        return head.next;
    }

    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" → ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String args[])  {

        _3_MergeTwo_SortedLL obj = new _3_MergeTwo_SortedLL();

        // Create list1: 1 → 3 → 5
        ListNode l1 = obj.new ListNode(1);
        l1.next = obj.new ListNode(3);
        l1.next.next = obj.new ListNode(5);

        //  Create list2: 2 → 4 → 6
        ListNode l2 = obj.new ListNode(2);
        l2.next = obj.new ListNode(4);
        l2.next.next = obj.new ListNode(6);

        // Merge
        ListNode merged = obj.mergeTwoLists(l1, l2);

        // Print result
        System.out.print("Merged List: ");
        obj.printList(merged); // Expected: 1 → 2 → 3 → 4 → 5 → 6

    }
}
