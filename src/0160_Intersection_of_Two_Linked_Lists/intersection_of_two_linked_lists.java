/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null && headB != null || headA != null & headB == null) return null;
        ListNode p1 = headA;
        ListNode p2 = headB;
        int times = 0;
        while (p1 != p2) {
            if (times > 2) return null;
            if (p1.next == null) {
                p1 = headB;
                times++;
            } else {
                p1 = p1.next;
            }
            if (p2.next == null) {
                p2 = headA;
                times++;
            } else {
                p2 = p2.next;
            }
            
        }
        return p1;
    }
}
