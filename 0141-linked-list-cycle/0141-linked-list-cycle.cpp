/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        if (head == nullptr || head->next == nullptr) {
            return false; // No cycle if the list is empty or has only one node.
        }
        
        ListNode* one = head;
        ListNode* two = head;
        
        
        while(two != nullptr && two->next != nullptr){
            one = one -> next;
            two = two -> next -> next;
        
            if (one == two) {          // If they meet, there's a cycle
                return true;
            }
        }
        

        return false;
        
    }
};