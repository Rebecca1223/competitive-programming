/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* current = list2;
        ListNode* head = list2;
        
        if (list1 == nullptr && list2 == nullptr) {
            return list1;
        } else if (list1 == nullptr) {
            return list2;
        } else if (list2 == nullptr) {
            return list1;
        }
        
        if (list1->val < list2->val) {
            current = list1;
            head = list1;
            list1 = list1->next;
        } else {
            list2 = list2->next;
        }
        
        while (list1 && list2) {
            if (list1->val < list2->val) {
                current->next = list1;
                list1 = list1->next;
            } else {
                current->next = list2;
                list2 = list2->next;
            }
            current = current->next;
        }
        
        if (!list1 && list2) {
            current->next = list2;
        } else if (list1 && !list2) {
            current->next = list1;
        }
        
        return head;
    }
};