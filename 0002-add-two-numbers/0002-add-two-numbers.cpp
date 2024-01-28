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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* output = new ListNode(0);
        ListNode* current = output;
        ListNode* prev = nullptr;
        
        while (l1 && l2) {
            int sum = l1->val + l2->val;
            
            if (current) { // node exists
                sum += current->val;
                current->val = sum%10;
                
                if (sum > 9) {
                    ListNode* temp = new ListNode(1);
                    current->next = temp;
                }
            } else {
                ListNode* one = new ListNode(sum%10);
                if (prev) {
                    prev->next = one;
                }
                current = one;
                
                if (sum > 9) {
                    ListNode* temp = new ListNode(1);
                    current->next = temp;
                }
            }
            
            if (prev) {
                prev = prev->next;
            } else {
                prev = current;
            }
            current = current->next;
            l1 = l1->next;
            l2 = l2->next;
        }
        
        ListNode* remainder = l1 ? l1 : l2;
        
        while (remainder) {
            if (current) {
                int sum = current->val + remainder->val;
                current->val = sum%10;
                
                if (sum > 9) {
                    ListNode* temp = new ListNode(1);
                    current->next = temp;
                }
                
                if (prev) {
                    prev = prev->next;
                } else {
                    prev = current;
                }
                current = current->next;
                remainder = remainder->next;
            } else {
                prev->next = remainder;
                remainder = nullptr;
            }
        }
        
        return output;
    }
};