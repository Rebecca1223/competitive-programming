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
    void reorderList(ListNode* head) {
        if (!head->next) return;
        ListNode* current = head;
        ListNode* original = head->next;

        vector<ListNode*> reversed;
        int len = -1;
        
        ListNode* temp = head;
        while (temp) {
            reversed.push_back(temp);
            temp = temp->next;
            len++;
        }
        
        while (len > 0) {
            current->next = reversed.back();
            current = current->next;
            reversed.pop_back();          
            current->next = original;
            original = original->next;
            current = current->next;
            len-=2;
        }
        current->next = nullptr;
    }
};