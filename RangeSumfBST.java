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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){int temp = root.val; if(temp>=low && temp<=high){return 1;}else{return 0;}}
        Queue<TreeNode> queue = new LinkedList<>();
        int sum =0;
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp.left != null){queue.offer(temp.left);}
            if(temp.right != null){queue.offer(temp.right);}
            if(temp.val >=low &&  temp.val <= high){sum+=temp.val;}
        }
        return sum;

        
    }
}
