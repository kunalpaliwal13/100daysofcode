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
    public boolean solution(TreeNode p, TreeNode q) {
        if(p==null || q==null){if(p==null&&q==null){return true;}else{return false;}}
        if(p.val !=q.val){return false;}
        return solution(p.left, q.right) && solution(p.right, q.left);

    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null){return true;}
        return solution(root.left, root.right);
    }
}
