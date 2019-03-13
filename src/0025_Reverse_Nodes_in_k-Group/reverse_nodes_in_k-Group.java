/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode m = dummy;
        ListNode n = head;
        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            if (head != null) a[k-i-1] = head.val;
            else return n;
            head = head.next;
        }
        for (int i = 0; i < k; i++) {
            m.next = new ListNode(a[i]);
            m = m.next;
        }
        m.next = reverseKGroup(head, k);
        return dummy.next;
    }
}