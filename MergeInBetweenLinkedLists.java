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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ptr = list1;
        ListNode nodeA= list1;
        ListNode nodeB= list1;

        for(int i=0; i<=b; i++){
            if(i==a-1){nodeA= ptr;}
            if(i==b){nodeB= ptr;}
            ptr= ptr.next;
        }
        nodeA.next = list2;
        while(list2.next != null){
            list2= list2.next;
        }
        list2.next = nodeB.next;
        return list1;
    }
}
