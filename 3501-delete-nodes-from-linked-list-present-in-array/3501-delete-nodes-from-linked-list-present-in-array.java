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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        HashSet<Integer>keys = new HashSet<>();
        for(int one : nums){
            keys.add(one);
        }
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(head != null){
            if(keys.contains(head.val)){
                // nums = nums.next;
                head = head.next;
                continue;
            }
            else{
                current.next = new ListNode(head.val);
                current = current.next;
            }

            head = head.next;
        }

        return dummy.next;
    }
}