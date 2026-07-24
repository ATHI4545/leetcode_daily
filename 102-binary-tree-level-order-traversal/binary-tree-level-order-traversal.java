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

    public void level(TreeNode root, List<List<Integer>>arr){
       Queue<TreeNode> que=new LinkedList<>();
       que.offer(root);
       while(!que.isEmpty()){
        int size=que.size();
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode temp=que.poll();
            lst.add(temp.val);
            if(temp.left!=null){
                que.offer(temp.left);
            }
            if(temp.right!=null){
                que.offer(temp.right);
            }
        }
        arr.add(lst);
       }

    
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        level(root,list);

        return list;
    }
}