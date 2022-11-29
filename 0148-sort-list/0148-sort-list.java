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
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> list = new PriorityQueue<>((a,b)-> Integer.compare(a,b));
        ListNode curr = head;
        while(curr!=null){
            list.add(curr.val);
            curr = curr.next;
        }
        
        ListNode dummyNode = new ListNode(0);
        ListNode node = dummyNode;
        
        while(!list.isEmpty()){
            node.next = new ListNode(list.poll());
            node = node.next;
        }
        
        return dummyNode.next;
    }
    
    
}