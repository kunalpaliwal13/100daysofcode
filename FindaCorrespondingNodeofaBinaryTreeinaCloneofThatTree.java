/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    public TreeNode getNode(TreeNode root, int target){
        if(root==null){return null;}
        if(root.val == target ){return root;}
        TreeNode left = getNode(root.left, target);
        if(left!=null){return left;}
        else{return getNode(root.right, target);}
    }
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode node = getNode(cloned, target.val);
        return node;
        
    }
}
