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
        int size =0;
        ListNode ptr = head;
        while(ptr != null){
            size++;
            ptr = ptr.next;

        }
        return size;
    }
    public int pairSum(ListNode head) {
        int size = size(head);
        int[] arr = new int[size/2];
        ListNode ptr = head;
        for( int i=0; i< size/2; i++){
            ptr= ptr.next;
        }

        for( int i=arr.length-1; i>=0; i--){
            arr[i]= ptr.val;
            ptr=ptr.next;
        }
        int max=0;
        for( int i =0; i< arr.length; i++){
            max =Math.max(head.val+ arr[i], max);
            head = head.next;

        }
        
        return max;
    }
}
