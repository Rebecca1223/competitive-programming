/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
public:
    Node* copyRandomList(Node* head) {
        if (!head) return nullptr;
        Node* copy = head->next;
        
        unordered_map<Node*, Node*> mp;
        Node* current = new Node{head->val};
        Node* output = current;
        mp[head] = current;
        
        while (copy) {
            Node* tmp = new Node(copy->val);
            current->next = tmp;
            mp[copy] = tmp;
            current = current->next;
            copy = copy->next;
        }
        
        current = output;
        while (head) {
            current->random = mp[head->random];
            current = current->next;
            head = head->next;
        }
        
        return output;
    }
};