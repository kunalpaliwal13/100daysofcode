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
    public boolean solution(TreeNode root, int sum, int target){
        if(root == null){return false;}
        if(root.left ==null && root.right == null && sum + root.val == target){return true;}
        sum+= root.val;
        return solution(root.left, sum, target) || solution(root.right, sum, target);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root ==null){return false;}
        int sum= 0;
        return solution(root, sum, targetSum);


        
    }
}
