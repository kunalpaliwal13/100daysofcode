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
    public int size(ListNode head){
        int size=0;
        ListNode ptr = head;
        while(ptr != null){
            size++;
            ptr= ptr.next;
        }
        return size;
    }
    public ListNode swapNodes(ListNode head, int k) {
        int len = size(head);
        ListNode nodeA=head;
        ListNode nodeB= head;
        ListNode ptr = head;
        for( int i=0; i<=Math.max(k-1, len-k);i++){
            if(i==(k-1)){nodeA = ptr;}
            if(i==(len-k)){
                nodeB = ptr;
            }
            ptr= ptr.next;
        }
        int temp = nodeA.val;
        nodeA.val = nodeB.val;
        nodeB.val = temp;
        return head;
    }
}
