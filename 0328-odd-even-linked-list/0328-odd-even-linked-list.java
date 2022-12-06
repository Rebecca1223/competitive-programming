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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode save = head.next;
        ListNode cur = head;
        int num = 1;
        while (cur != null) {
            odd.next = even.next;
            odd = odd.next;
            cur = cur.next;
            num++;
            if (cur == null) break;
            even.next = odd.next;
            even = even.next;
            cur = cur.next;
            num++;
        }
        if (num % 2 == 0) {
            num /= 2;
            cur = head;
            for (int i = 0; i < num - 1; i++) {
                cur = cur.next;
            }
            cur.next = save;
        } else {
            odd.next = save;
        }
        return head;
    }
}