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
    public boolean Traversal(TreeNode p, TreeNode q){
        if(p==null || q==null){if((p==null && q==null)==false){return false;}else{}return true;}
        if(p.val != q.val){return false;}
        return Traversal(p.left, q.left) && Traversal(p.right, q.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return Traversal(p, q);
        
    }
}
