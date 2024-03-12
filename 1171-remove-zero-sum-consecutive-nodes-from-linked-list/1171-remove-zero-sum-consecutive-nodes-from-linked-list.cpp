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
    ListNode* removeZeroSumSublists(ListNode* head) {
        unordered_map<int, int> location = {{0, -1}}; // sum, index
        unordered_map<int, int> sub; // start, end
        
        while (head && head->val == 0) head = head->next;
        if (!head) return nullptr;
        
        ListNode* copy = head;
        ListNode* prev = nullptr;
        
        int sum = 0, i = 0;
        while (copy) {
            if (copy->val == 0) {
                copy = copy->next;
                prev->next = copy;
                continue;
            }
            
            sum += copy->val;
            if (location.count(sum) == 1) {
                sub[location[sum] + 1] = i;
            }
            if (sum != 0) location[sum] = i;
            i++;
            prev = copy;
            copy = copy->next;
        }
        
        i = 0;
        while (sub.count(i) == 1) {
            for (i; i <= sub[0]; i++) {
                head = head->next;
            }
        } 
        
        i += 1;
        
        if (!head) return nullptr;
        
        copy = head->next;
        prev = head;

        while (copy) {
            if (sub.count(i) == 1) {
                int temp = i;
                while (i <= sub[temp]) {
                    copy = copy->next;
                    i++;
                }
                prev->next = copy;
            } else {
                i++;
                copy = copy->next;
                prev = prev->next;
            }
        }
        
        return head;
    }
};