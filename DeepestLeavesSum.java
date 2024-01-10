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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null){return 0;}
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> lst = new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int levelsize = queue.size();
            for( int i=0; i< levelsize; i++){
                TreeNode tempNode = queue.poll();
                temp.add(tempNode.val);
                if(tempNode.left !=null){queue.offer(tempNode.left);}
                if(tempNode.right !=null){queue.offer(tempNode.right);}

            }
            lst = temp;

        }
        int res =0;
        for( int i=0; i< lst.size(); i++){
            res+=lst.get(i);
        }
        return res;
        
    }
}
