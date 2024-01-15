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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();
        if(root==null){return lst;}
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int lvl= queue.size();
            List<Integer> templst = new ArrayList<>();
            for( int i =0; i< lvl; i++){
                TreeNode tempNode = queue.poll();
                if(tempNode.left!=null){queue.offer(tempNode.left);}
                if(tempNode.right!=null){queue.offer(tempNode.right);}
                templst.add(tempNode.val);

            }
            lst.add(0, templst);
        }
        return lst;
    }
}
