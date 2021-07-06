/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        // edge case;
        if(head == null || head.next == null)
            return false;
        
        ListNode slow = head, fast = head.next;
        
        // if there is a link then fast and slow must meet once at a point
        while(fast !=null && fast.next != null){
            if(slow==fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return false;
        
    }
}