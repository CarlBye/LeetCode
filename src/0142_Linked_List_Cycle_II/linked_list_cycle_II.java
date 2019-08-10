/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode p1 = head, p2 = head;
        boolean isCycle = false;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                isCycle = true;
                break;
            }
        }
        if (!isCycle) return null;
        ListNode p3 = head;
        while (p1 != p3) {
            p1 = p1.next;
            p3 = p3.next;
        }
        return p1;
    }
}
