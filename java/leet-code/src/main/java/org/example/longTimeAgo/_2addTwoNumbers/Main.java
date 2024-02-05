package org.example.longTimeAgo._2addTwoNumbers;

public class Main {
    public static void main(String[] args) {
        ListNode nodeA3 = new ListNode(3, null);
        ListNode nodeA2 = new ListNode(4, nodeA3);
        ListNode nodeA1 = new ListNode(2, nodeA2);

        ListNode nodeB3 = new ListNode(4, null);
        ListNode nodeB2 = new ListNode(6, nodeB3);
        ListNode nodeB1 = new ListNode(5, nodeB2);

        ListNode result = Solution.addTwoNumbers(nodeA1, nodeB1);
        System.out.println(result);
    }
}
