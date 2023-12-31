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
    public int height(TreeNode root, int count){
        if(root==null){return 0;}
        if(root.left==null && root.right ==null){return count++;}
        return Math.max(Math.max(++count, height(root.left, count)), height(root.right, count));
    }
    public int maxheights(TreeNode root, int max, int h){
        if(root ==null ){return 0;}
        if(root.left ==null && root.right ==null){return 0;}
        int c1 =0; 
        int c2=0;
        int h1=0; int h2=0;
        if(root.left!=null){h++;h1= height(root.left, c1);}
        if(root.right!=null){h++;h2= height(root.right, c2);}
        max = Math.max(h1+h2+h, max);
        return Math.max(Math.max(maxheights(root.left, max, 0), max), maxheights(root.right, max, 0));

    }
    public int diameterOfBinaryTree(TreeNode root) {
        int max=0;
        int h=0;
        return maxheights(root, max, h);
    }   
}
