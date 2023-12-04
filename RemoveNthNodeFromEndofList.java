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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){return null;}
        int len = size(head)-n;
        if(len ==0){return head.next;}
        ListNode ptr = head;
        ListNode temp= new ListNode(0);
        for( int i=0; i<len; i++){
            if(i==len-1){ temp = ptr; }
            ptr = ptr.next;
        }
        
        if(ptr!= null){temp.next = ptr.next;}
        else{temp.next = null;}
        return head;
    }
}
