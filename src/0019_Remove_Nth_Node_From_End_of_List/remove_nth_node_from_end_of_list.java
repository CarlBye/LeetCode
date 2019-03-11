/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); 
        dummy.next = head;
        ListNode l = head;
        int len = 0;
        while (l != null) {
            len ++;
            l = l.next;
        }
        l = dummy;
        while (len > n) {
            len--;
            l = l.next;
        }
        l.next = l.next.next;
        return dummy.next;
    }
}