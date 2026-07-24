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

    public void preoder(TreeNode root,List<Integer> arr){
        if(root==null){
            return;
        }
        arr.add(root.val);
        preoder(root.left,arr);
        preoder(root.right,arr);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst=new ArrayList<>();

        preoder(root,lst);

        return lst;
    }
}