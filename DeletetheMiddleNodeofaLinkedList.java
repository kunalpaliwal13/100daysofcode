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
            ptr= ptr.next;
            size++;
        }
        return size;
    }
    public ListNode deleteMiddle(ListNode head) {
      if(head.next ==null){return null;}
        int len = size(head);
        int ind = len/2;
        ListNode ptr = head;
        for( int i =0; i< ind; i++){
            if(i==ind-1 ){if(ptr.next ==null){return head;}ptr.next = ptr.next.next; return head;}
            ptr = ptr.next;

        }
        return head;
    }
}
