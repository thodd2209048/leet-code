package org.example._24SwapNodesInPairs;

class Solution {
    public static ListNode swapPairs(ListNode head) {
        ListNode beforeFirstHead = new ListNode(0, head);
        ListNode subHead = head;
        ListNode beforeSubHead = beforeFirstHead;

        while (subHead != null && subHead.next != null) {
            ListNode nextSubHead = subHead.next.next;

            swapPair(beforeSubHead, subHead);

            beforeSubHead = subHead;
            subHead = nextSubHead;
        }

        return beforeFirstHead.next;
    }

    private static void swapPair(ListNode beforeHead, ListNode head) {
        ListNode tail = head.next;
        head.next = tail.next;
        beforeHead.next = tail;
        tail.next = head;

    }

}
