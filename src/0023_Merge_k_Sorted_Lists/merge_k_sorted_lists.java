/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len == 0) return null;
        ListNode ans = new ListNode(0);
        ans.next = lists[0];        
        ListNode l1, l2;
        for (int i = 1; i < len; i++) {
            if (lists[i] != null) ans.next = mergeTwoLists(ans.next, lists[i]);
        }
        return ans.next;
    }
    
    public ListNode mergeTwoLists(ListNode p1, ListNode p2) {
        ListNode dummy = new ListNode(0);
        ListNode l = dummy;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                l.next = p1;
                p1 = p1.next;
            } else {
                l.next = p2;
                p2 = p2.next;
            }
            l = l.next;
        }
        if (p1 == null && p2 != null) l.next = p2;
        if (p1 != null && p2 == null) l.next = p1;
        return dummy.next;
    }
}