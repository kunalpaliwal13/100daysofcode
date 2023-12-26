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
    public void LevelOrder( List<List<Integer>> ans,Queue<TreeNode> queue1){
        if(queue1.isEmpty()){return;}
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue2= new LinkedList<>();
        while(!queue1.isEmpty()){
            TreeNode temp = queue1.poll();
            if(temp.left != null){queue2.offer(temp.left);}
             if(temp.right != null){queue2.offer(temp.right);}
            list.add(temp.val);
        }
        ans.add(list);
        LevelOrder(ans, queue2);
        

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){return ans;}
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        ans.add(list);
        Queue<TreeNode> queue = new LinkedList<>();
        if(root.left != null){queue.offer(root.left);}
        if(root.right != null){queue.offer(root.right);}
        LevelOrder(ans, queue);
        return ans;
        
    }
}
