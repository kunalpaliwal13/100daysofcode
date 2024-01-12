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
    public int addSum(TreeNode root){
        TreeNode left = root.left;
        TreeNode right = root.right;
        return addSum(left, right);

    }
    public int addSum(TreeNode left, TreeNode right){
        int count =0;
        if(left!= null){
            if(left.left!=null){count+=left.left.val;}
            if(left.right!=null){count+=left.right.val;}
            }
        if(right!= null){
            if(right.left!=null){count+=right.left.val;}
            if(right.right!=null){count+=right.right.val;}
            }
        return count; 
    }

    public int sumEvenGrandparent(TreeNode root) {
        int count =0;
        if(root==null || (root.left ==null && root.right ==null)){return count;}
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            for( int i =0; i< queue.size(); i++){
                TreeNode temp = queue.poll();
                if(temp.left != null){queue.offer(temp.left);}
                if(temp.right != null){queue.offer(temp.right);}
                if(temp.val%2==0){count += addSum(temp);}
            }
        }
        return count;

        
    }
}
