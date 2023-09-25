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
    public int getDecimalValue(ListNode head) {
        String sum ="";
        ListNode i = head;
        while(i!=null){
            
            sum =sum+ i.val;
            i= i.next;
        }
        int res = Integer.parseInt(sum, 2);
        return res;
    
    
    }
}
