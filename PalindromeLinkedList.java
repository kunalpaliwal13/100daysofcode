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
    public static int size(ListNode head){
        int size=0;
        ListNode ptr = head;
        while(ptr!= null){
            ptr= ptr.next;
            size++;
        }
        return size;
    }
    public boolean isPalindrome(ListNode head) {
        int len = size(head);
        Stack<Integer> st = new Stack<>();
        ListNode ptr = head;
        for( int i=0; i< len/2;i++){
            ptr= ptr.next;
        }
        if(len%2 !=0){ptr=ptr.next;}
        for( int i=0; i<len/2; i++){
            st.push(ptr.val);
            ptr=ptr.next;
        }
        for( int i=0; i< len/2; i++){
            if(st.pop()!= head.val){return false;}
            head= head.next;
        }
        return true;
    }
}
