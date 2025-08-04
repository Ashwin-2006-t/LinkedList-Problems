/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            // Check for duplicates
            if (current.next != null && current.val == current.next.val) {
                int duplicateVal = current.val;
                // Skip all nodes with this duplicate value
                while (current != null && current.val == duplicateVal) {
                    current = current.next;
                }
                // Connect prev to the node after duplicates
                prev.next = current;
            } else {
                prev = current;
                current = current.next;
            }
        }

        return dummy.next;
    }
}
