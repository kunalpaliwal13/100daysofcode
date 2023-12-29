/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int height(TreeNode node, int count){
        if(node==null){return count;}if(node.left ==null && node.right ==null){return count++;}
        count++;
        return Math.max(Math.max(count, height(node.left, count)),height(node.right, count));
    }

    public boolean balance(TreeNode node){
        if(node==null || (node.left==null  && node.right ==null)){return true;}
        int count =0;
        if(node.left ==null){if(height(node.right, count)>=1){return false;}}
        if(node.right ==null){if(height(node.left, count)>=1){return false;}}
        int diff= Math.abs(height(node.left, count) - height(node.right, count));
        if(diff>1){return false;}
        return balance(node.left) && balance(node.right);
    }

    public boolean isBalanced(TreeNode root) {
        if(root==null){return true;}
        
        return balance(root);
        
    }
}
