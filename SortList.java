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
    public ListNode sortList(ListNode head) {
        if(head==null){return null;}
        ArrayList<Integer> arr = new ArrayList<>();
        while(head!= null){
            arr.add(head.val);
            head=head.next;
        }
        Collections.sort(arr);
        ListNode headAns = new ListNode(arr.get(0));
        ListNode ptr = headAns;
        for( int i=1; i< arr.size(); i++){
            ListNode node = new ListNode(arr.get(i));
            ptr.next = node;
            ptr= node;
        }
        return headAns;

    }
}
