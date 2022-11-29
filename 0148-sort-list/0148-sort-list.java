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
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            list.add(curr.val);
            curr = curr.next;
        }
        
        Collections.sort(list);
        
        ListNode dummyNode = new ListNode(0);
        ListNode node = dummyNode;
        
        for(Integer val: list){
            node.next = new ListNode(val);
            node = node.next;
        }
        
        return dummyNode.next;
    }
    
    
}