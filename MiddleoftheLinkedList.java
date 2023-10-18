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
        while(ptr!= null){
            size++;
            ptr= ptr.next;
        }
        return size;
    }
    public ListNode middleNode(ListNode head) {
        int size = size(head);
        int limit= size/2+1;

        ListNode ptr= head;
        for(int i=1; i<limit; i++){
                ptr= ptr.next;
        }
        return ptr;
        
    }
}
