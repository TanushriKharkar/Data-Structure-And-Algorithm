package _5_Linked_List;
import java.util.*;

public class _8_CloneLL_WithRandom_Pointers {

    // Definition for a Node.
    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Map<Node, Node> hashMap = new HashMap<>();
        Node curr = head;

        while(curr != null) {
            hashMap.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;

        while(curr != null) {
            Node copy = hashMap.get(curr);
            copy.next = hashMap.get(curr.next);     // link the 'next' pointer
            copy.random = hashMap.get(curr.random);     // link the 'random' pointer
            curr = curr.next;
        }

        return hashMap.get(head);
    }

    // Helper to print list
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print("Node: " + curr.val);
            System.out.print(", Next: " + (curr.next != null ? curr.next.val : "null"));
            System.out.print(", Random: " + (curr.random != null ? curr.random.val : "null"));
            System.out.println();
            curr = curr.next;
        }
    }


    public static void main(String args[])  {
        // Manually creating list:
        // Node1 → Node2 → Node3
        // random pointers: 1→3, 2→1, 3→2

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.next = node3;

        node1.random = node3;
        node2.random = node1;
        node3.random = node2;

        System.out.println("Original list:");
        printList(node1);

        _8_CloneLL_WithRandom_Pointers sol = new _8_CloneLL_WithRandom_Pointers();
        Node copiedHead = sol.copyRandomList(node1);

        System.out.println("\nCopied list:");
        printList(copiedHead);
    }
}

