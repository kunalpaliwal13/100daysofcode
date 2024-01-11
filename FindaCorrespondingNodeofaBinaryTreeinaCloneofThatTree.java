/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    public TreeNode getNode(TreeNode root, TreeNode target){
        if(root==null){return null;}
        if(root == target ){return root;}
        TreeNode left = getNode(root.left, target);
        TreeNode right = getNode(root.right, target);
        if(left ==null){return right;}else{return left;}
    }
    public TreeNode getNode(TreeNode root, int target){
        if(root==null){return null;}
        if(root.val == target ){return root;}
        TreeNode left = getNode(root.left, target);
        TreeNode right = getNode(root.right, target);
        if(left ==null){return right;}else{return left;}
    }
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode node1= getNode(original, target);
        TreeNode node = getNode(cloned, node1.val);
        return node;
        
    }
}
