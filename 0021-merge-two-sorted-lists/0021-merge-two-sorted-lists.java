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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        
        ListNode temp = null;
        ListNode prev = null;
        ListNode head = null;
        
        if (list1.val <= list2.val) {
            head = list1;
        } else {
            head = list2;
        }
        
        
        while (list1 != null && list2 != null) {
            if (list2.val < list1.val) {
                temp = list2.next;
                list2.next = list1;
                if (prev != null) {
                    prev.next = list2;
                }
                prev = list2;
                list2 = temp;
            } else { 
                prev = list1;
                list1 = list1.next;
            }
        }
        
        if (list2 != null) {
            prev.next = list2;
        }
        
        return head;
    }
}