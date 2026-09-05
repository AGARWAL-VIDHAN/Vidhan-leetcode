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
    public ListNode removeNodes(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode node=head;
        ListNode NxtGreater=removeNodes(node.next);
        node.next=NxtGreater;
        if(NxtGreater==null || node.val>=NxtGreater.val ){
            return node;
        }
        return NxtGreater;
        
        
    }
}