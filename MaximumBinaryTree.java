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
    public int returnInd(int[] nums){
        int ind=0;
        int max=0;
        for( int i=0; i<  nums.length; i++){
            if(nums[i]>max ){max= nums[i]; ind =i;}
        }
        return ind;
    }

    public void createLeftNode(TreeNode root, int[] nums){
        int ind = returnInd(nums);
        int[] num1 = Arrays.copyOfRange(nums, 0, ind);
        int[] num2 = Arrays.copyOfRange(nums, ind+1, nums.length);
        //ind --> 3
        root.left  = new TreeNode(nums[ind]);
        root.left.left = constructMaximumBinaryTree(num1);
        root.left.right = constructMaximumBinaryTree(num2);
    }
    public void createRightNode(TreeNode root, int[] nums){
        int ind = returnInd(nums);
        int[] num1 = Arrays.copyOfRange(nums, 0, ind);
        int[] num2 = Arrays.copyOfRange(nums, ind+1, nums.length);
        //ind --> 3
        root.right  = new TreeNode(nums[ind]);
        root.right.left = constructMaximumBinaryTree(num1);
        root.right.right = constructMaximumBinaryTree(num2);
    }
 


    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if( nums.length ==0){return null;}

        //creating num1 and num2
        int ind = returnInd(nums);
        int[] num1 = Arrays.copyOfRange(nums, 0, ind);
        int[] num2 = Arrays.copyOfRange(nums, ind+1, nums.length);
        TreeNode root = new TreeNode(nums[ind]);
        if(num1.length !=0){createLeftNode(root, num1);}
        if(num2.length !=0){createRightNode(root, num2);}
        return root;


    
    }
}
