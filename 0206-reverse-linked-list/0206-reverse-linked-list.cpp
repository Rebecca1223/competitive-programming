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
    ListNode* reverseList(ListNode* head) {
        if (!head || head->next == nullptr) return head;
        
        ListNode* ptr = head;
        ListNode* temp = head->next;
        ptr->next = nullptr;
        
        while (temp) {
            ptr = temp;
            temp = temp->next;
            ptr->next = head;
            head = ptr;
        }
        
        return head;
    }
};