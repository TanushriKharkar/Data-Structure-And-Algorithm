package _5_Linked_List;

public class _6_DetectCycle {

    //Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
          val = x;
          next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)   {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    public static void main(String args[])  {
        _6_DetectCycle obj = new _6_DetectCycle();

        // Create nodes
        ListNode head = obj.new ListNode(3);
        ListNode node2 = obj.new ListNode(2);
        ListNode node3 = obj.new ListNode(0);
        ListNode node4 = obj.new ListNode(-4);

        // Link them together: 3 → 2 → 0 → -4
        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Create a cycle: -4 → 2
        node4.next = node2;

        // Call detectCycle
        ListNode cycleStart = obj.detectCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
