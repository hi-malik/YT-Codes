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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        curr = head;
        for(int i = 0; i < count / 2; i++){
            curr = curr.next;
        }
        return curr;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)

// Date :- 05/12/2022