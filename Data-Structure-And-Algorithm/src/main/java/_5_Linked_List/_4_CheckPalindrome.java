package _5_Linked_List;
import java.util.*;

public class _4_CheckPalindrome {

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

    public boolean isPalindrome(ListNode head) {
        List<Integer> ll = new ArrayList<>();

        while(head != null) {
            ll.add(head.val);
            head = head.next;
        }

        int left = 0;
        int right = ll.size() - 1;

        while(left < right)  {

            if(!ll.get(left).equals(ll.get(right)))  {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String args[])  {
        _4_CheckPalindrome obj = new _4_CheckPalindrome();

        // Test 1: Palindrome list: 1 → 2 → 3 → 2 → 1
        ListNode node1 = obj.new ListNode(1);
        ListNode node2 = obj.new ListNode(2);
        ListNode node3 = obj.new ListNode(3);
        ListNode node4 = obj.new ListNode(2);
        ListNode node5 = obj.new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println("Is Palindrome? " + obj.isPalindrome(node1)); // true

        // Test 2: Non-palindrome list: 1 → 2 → 3
        ListNode a = obj.new ListNode(1);
        ListNode b = obj.new ListNode(2);
        ListNode c = obj.new ListNode(3);

        a.next = b;
        b.next = c;

        System.out.println("Is Palindrome? " + obj.isPalindrome(a)); // false

    }
}
