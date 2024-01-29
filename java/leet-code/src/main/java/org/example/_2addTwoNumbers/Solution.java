package org.example._2addTwoNumbers;

//https://leetcode.com/problems/add-two-numbers/description/
public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode beforeResult = new ListNode();
        ListNode node = beforeResult;
        int mem = 0;
        while (l1 != null || l2 != null || mem != 0) {
            node.next = new ListNode();
            node = node.next;
            if (l1 == null) l1 = new ListNode(0, null);
            if (l2 == null) l2 = new ListNode(0, null);

            int sumVal = l1.val + l2.val + mem;
            int val = sumVal % 10;
            mem = sumVal > 9 ? 1 : 0;

            node.val = val;

            l1=l1.next;
            l2=l2.next;
        }

        return beforeResult.next;
    }
}