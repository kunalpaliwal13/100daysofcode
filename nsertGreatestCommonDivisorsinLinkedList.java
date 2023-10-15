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

    public static int gcd(int a, int b){
    int ans =0;
    for( int i=1; i<=a && i<=b; i++){
        if(a%i== 0 && b%i==0 && i> ans){
            ans=i;
        } 
    }
    return ans;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode tempnode= head;

        while(tempnode.next != null){
            int ins = gcd(tempnode.val, tempnode.next.val);
            ListNode node = new ListNode();
            node.val = ins;

            node.next = tempnode.next;
            tempnode.next = node; 
            tempnode = node.next;
        }
        return head;
    }
    
}
