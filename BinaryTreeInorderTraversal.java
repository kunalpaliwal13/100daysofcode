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
    public List<Integer> preOrder(TreeNode node){
        ArrayList<Integer> arr = new ArrayList<>();
        if( node== null){return arr;}
        preOrder(node.left, arr);
        arr.add(node.val);
        preOrder(node.right, arr);
        return arr;

    }
    public void preOrder(TreeNode node, List<Integer>arr){
        if( node== null){return;}
        preOrder(node.left, arr);
        arr.add(node.val);
        preOrder(node.right, arr);
        return;

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = preOrder(root);
        
        return arr;
        
    }
}
