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
    public void createAvg(Queue<TreeNode> queue, List<Double> res){
        if(queue.isEmpty()){return;}
        Queue<TreeNode> tempQueue = new LinkedList<>();
        Double avgSum=0.0;
        Double count =0.0;
        while(!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            if(tempNode ==null){continue;}
            if(tempNode.left != null){
                avgSum +=tempNode.left.val;
                count++;
                tempQueue.offer(tempNode.left);
            }
            if(tempNode.right != null){
                avgSum +=tempNode.right.val;
                count++;
                tempQueue.offer(tempNode.right);
            }
        }

        if(count!=0){res.add(avgSum/count);}
        System.out.println(avgSum+ " "+  count);
        createAvg(tempQueue, res);
    }


    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<Double>();
        if(root==null){return res;}
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        Double dval =0.0;
        dval += root.val; 
        res.add(dval);
        createAvg(queue, res);
        return res;
        
    }
}
