package _5_Linked_List;

public class _9_AddTwoNums {


    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //time & space complexity => O(n)

        ListNode result = new ListNode(0);
        ListNode ptr = result;

        int carry = 0;      //set default carry

        while (l1 != null || l2 != null) {

            int sum = 0 + carry;        //initialize sum

            if (l1 != null) {           //use number from first list
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {           //use number from second list
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;           //get sm and carry
            sum = sum % 10;
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }

        if (carry == 1) {
            ptr.next = new ListNode(1);
        }

        return result.next;
    }

    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public ListNode createList(int[] digits) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int digit : digits) {
            curr.next = new ListNode(digit);
            curr = curr.next;
        }
        return dummy.next;
    }


    public static void main(String args[]) {
        _9_AddTwoNums obj = new _9_AddTwoNums();

        // Create input lists: 342 + 465
        ListNode l1 = obj.createList(new int[]{2, 4, 3}); // represents 342
        ListNode l2 = obj.createList(new int[]{5, 6, 4}); // represents 465

        // Call method
        ListNode result = obj.addTwoNumbers(l1, l2);

        // Print result
        System.out.print("Result: ");
        obj.printList(result); // Expected output: 7 -> 0 -> 8
    }
}
