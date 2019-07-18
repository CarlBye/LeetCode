/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (k == 0) return head;
        ListNode p1 = head;
        int len = 0;
        while (p1.next != null) {
            p1 = p1.next;
            len++;
        }
        len++;
        ListNode tail = p1;
        int off = k % len;
        if (off == 0) return head;
        p1 = head;
        for (int i = 0; i < len - off - 1; i++) {
            p1 = p1.next;
        }
        ListNode ans = p1.next;
        p1.next = null;
        tail.next = head;
        return ans;
    }
}
