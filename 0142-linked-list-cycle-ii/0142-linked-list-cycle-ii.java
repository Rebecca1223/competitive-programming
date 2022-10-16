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
        HashSet<ListNode> seen = new HashSet<ListNode>();
        
        while (seen.contains(head) != true && head != null) {
            seen.add(head);
            head = head.next;
        }
        return head;
    }
}