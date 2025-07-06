package _5_Linked_List;

public class _5_HasCycle {

    //Definition for singly-linked list.
     class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
     }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null)    {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)    {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])  {
        _5_HasCycle obj = new _5_HasCycle();

        // Create a list with a cycle: 3 → 2 → 0 → -4 → back to 2
        ListNode node1 = obj.new ListNode(3);
        ListNode node2 = obj.new ListNode(2);
        ListNode node3 = obj.new ListNode(0);
        ListNode node4 = obj.new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // cycle here

        // Test the hasCycle method
        boolean result = obj.hasCycle(node1);
        System.out.println("Has cycle? " + result); // true

        // Create a list without a cycle: 1 → 2 → 3 → null
        ListNode a = obj.new ListNode(1);
        ListNode b = obj.new ListNode(2);
        ListNode c = obj.new ListNode(3);

        a.next = b;
        b.next = c;

        result = obj.hasCycle(a);
        System.out.println("Has cycle? " + result); // false
    }
}
