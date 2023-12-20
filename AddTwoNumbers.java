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
    public void AddNode(ListNode node, ListNode head1, ListNode head2, int carry){
        int carr=0;
        if(head1 ==null && head2== null && carry==0){return;}
        ListNode temp = new ListNode(0);
        if(head1 != null){temp.val += head1.val; head1= head1.next;}
        if(head2 != null){temp.val += head2.val;head2= head2.next;}
        temp.val +=carry;
        if(temp.val >9){carr =1; temp.val = temp.val%10;}
        node.next = temp;
        AddNode(temp, head1, head2, carr);


    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        int carry=0;
        AddNode(ans, l1, l2, carry);



        return ans.next;
    }
}
