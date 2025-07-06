package _5_Linked_List;

public class _7_FlattenLL {

    // Definition for a Node.
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node flatten(Node head) {
        if(head == null)    {
            return head;
        }

        Node curr = head;
        while(curr != null)    {

            //when child node exists
            if(curr.child != null)  {

                //flatten the child node
                Node next = curr.next;
                curr.next = flatten(curr.child);

                curr.next.prev = curr;
                curr.child = null;

                //find tail
                while(curr.next != null)    {
                    curr = curr.next;
                }

                //attach tail with next pointer
                if(next != null)    {
                    curr.next = next;
                    next.prev = curr;
                }

            }
            curr = curr.next;
        }
        return head;
    }

    // Utility to print the list
    public void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String args[])  {
        _7_FlattenLL obj = new _7_FlattenLL();

        // Create nodes
        Node node1 = obj.new Node(1);
        Node node2 = obj.new Node(2);
        Node node3 = obj.new Node(3);
        Node node4 = obj.new Node(4);
        Node node5 = obj.new Node(5);
        Node node6 = obj.new Node(6);
        Node node7 = obj.new Node(7);

        // Main list: 1 <-> 2 <-> 3 <-> 4 <-> 5
        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next = node4;
        node4.prev = node3;
        node4.next = node5;
        node5.prev = node4;

        // Child: 3 -> 6 -> 7
        node3.child = node6;
        node6.next = node7;
        node7.prev = node6;

        // Flatten and print
        Node flattenedHead = obj.flatten(node1);
        System.out.print("Flattened list: ");
        obj.printList(flattenedHead);
    }
}
