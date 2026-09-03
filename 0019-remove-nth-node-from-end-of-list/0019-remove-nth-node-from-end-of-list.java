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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode newnode=new ListNode();
        newnode=head;
        while(newnode!=null){
            size++;
            newnode=newnode.next;
        }
        if(size==n){
            return head.next;
        }
        newnode=head;
        for(int i=1;i<size-n;i++){
            newnode=newnode.next;
        }
        newnode.next=newnode.next.next;
        
        
     return head;
     }
}