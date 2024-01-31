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
    public void traversal(TreeNode root, HashMap<Integer, Integer> hm){
        if(root ==null){return;}
        if(hm.containsKey(root.val)){
            hm.put(root.val, hm.get(root.val)+1);
        }
        else{
            hm.put(root.val, 1);
        }
        if(root.left!=null){traversal(root.left, hm);}
        if(root.right!=null){traversal(root.right, hm);}
    }

    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        traversal(root, hm);
        int max =0;
        ArrayList<Integer> key = new ArrayList<>();
        int count = 0;
        for (int value: hm.values()) {
            if(value> max){max = value;}
        }
        for(HashMap.Entry<Integer, Integer> entry: hm.entrySet()){
            if(entry.getValue() == max){key.add(entry.getKey());}
        }
        int[] array = new int[key.size()];
        for( int i=0; i< key.size(); i++){
            array[i] = key.get(i);
        }
        return array;
    }
}
