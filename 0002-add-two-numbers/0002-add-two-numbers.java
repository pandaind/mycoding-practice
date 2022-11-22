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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;
        
        
        ListNode resDummy = new ListNode(0), res = resDummy;
        
        int carry = 0;
        while(first != null || second != null) {
            
            int x = first != null ? first.val : 0;
            int y = second != null ? second.val : 0;
            
            int z = carry + x + y;
            
            carry = z / 10;
            res.next = new ListNode(z % 10);
            res = res.next;
            
            if(first!=null) first = first.next;
            if(second!=null) second = second.next;
        }
        
        if(carry > 0) {
            res.next = new ListNode(carry);
        }
        
        return resDummy.next;
    }
}