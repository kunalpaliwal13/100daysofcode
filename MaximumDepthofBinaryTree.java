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
        if(node ==null || (node.left ==null && node.right ==null)){return 1;}
        count ++;
        return Math.max(Math.max(count, height(node.left, count)), height(node.right, count));

    }
    public int maxDepth(TreeNode root) {
        if(root==null){return 0;}
        int count =1;
        return height(root, count);
        
    }
}
