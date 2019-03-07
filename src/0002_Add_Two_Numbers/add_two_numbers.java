/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        int carry = 0;
        ListNode l = sum;
        while(l1 != null || l2 != null) {
            if(l1 == null) {
                l.val = l2.val + carry;
            }
            else if(l2 == null) {
                l.val = l1.val + carry;
            }
            else l.val = l1.val + l2.val + carry;
            if (l.val >= 10) {
                carry = 1;
                l.val = l.val - 10;
            }
            else {
                carry = 0;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if(l1 != null || l2 != null) {
                l.next = new ListNode(0);
                l = l.next;
            }
        }
        if (carry != 0) l.next = new ListNode(carry);
        return sum;
    }
}