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
    bool isPalindrome(ListNode* head) {
        if (!head || head->next == nullptr) return head;
        
        int n = 0;
        ListNode* temp = head;
        while (temp) {
            temp = temp->next;
            n++;
        }
        
        int leftLen = 0;
        ListNode* second = head;
        if (n % 2 == 0) {
            n /= 2;
            leftLen = n-1;
        } else {
            leftLen = n/2 - 1;
            n = n/2 + 1;
        }
        
        for (int i = 0; i < n; i++) {
            second = second->next;
        }

        if (leftLen == 0) return head->val == second->val;
        
        ListNode* left = head;
        temp = head->next;
        left->next = nullptr;
        while (leftLen > 0) {
            left = temp;
            temp = temp->next;
            left->next = head;
            head = left;
            leftLen--;
        }
        
        while (head && second) {
            if (head->val != second->val) return false;
            head = head->next;
            second = second->next;
        }
        return true;
    }
};