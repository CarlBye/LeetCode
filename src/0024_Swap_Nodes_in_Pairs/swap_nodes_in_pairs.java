/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = head;
        head = head.next;
        p.next = head.next;
        head.next = p;
        p.next = swapPairs(p.next);       
        return head;
    }
}