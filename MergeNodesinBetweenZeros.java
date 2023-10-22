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
    public ListNode mergeNodes(ListNode head) {

        head= head.next;
        ListNode ans = head;
        ListNode ptr = head;
        while(ptr!= null){
            ptr= ptr.next;
            if(ptr.val == 0){
                head.next = ptr.next;
                ptr= ptr.next;
                head = ptr;

                
            }else{
            head.val = head.val+ ptr.val;
            head.next = ptr.next;}
        }
    return ans;
    }

}
