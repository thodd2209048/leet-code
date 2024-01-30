package org.example._24SwapNodesInPairs;

//https://leetcode.com/problems/swap-nodes-in-pairs/description/
public class Main {
    public static void main(String[] args){
        ListNode node4 = new ListNode(4, null);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode result = Solution.swapPairs(node1);

        System.out.println(result);
    }
}
