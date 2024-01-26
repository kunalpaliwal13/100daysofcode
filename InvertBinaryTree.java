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
    public void construct(TreeNode root, TreeNode root2){
        if(root ==null){return;}
        if(root.left ==null && root.right ==null){return;}
        if(root.left !=null){root2.right =new TreeNode(root.left.val);}
        if(root.right !=null){root2.left =new TreeNode(root.right.val);}
        construct(root.right, root2.left);
        construct(root.left, root2.right);
    }
    public TreeNode invertTree(TreeNode root) {
        if(root ==null){return null;}
        TreeNode root2 = new TreeNode(root.val);
        construct(root, root2);
        return root2;
    }
}
