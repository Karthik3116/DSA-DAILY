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
        
        ListNode* dummy = new ListNode(-1);
        ListNode* current = dummy;

        if (list1==NULL)
        {return list2;}
        else if (list2==NULL)
        {return list1;}
        while(list1 != nullptr && list2 != nullptr){
            if(list1 -> val <= list2 -> val){
                current -> next = new ListNode(list1 -> val);
                list1 = list1 -> next;
                
            }else{
                current -> next = new ListNode(list2 -> val);
                list2 = list2 -> next;
            }

            current = current -> next;
        }

        if(list1 == nullptr){
            while(list2 != nullptr){
                current -> next = new ListNode(list2 -> val);
                list2 = list2 -> next;
                current = current -> next;
            }
        }else{
            while(list1 != nullptr){
                current -> next = new ListNode(list1 -> val);
                list1 = list1 -> next;
                current = current -> next;
            }
        }

        return dummy->next;
    }
};