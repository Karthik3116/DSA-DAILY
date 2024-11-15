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
    public int sumOfLeftLeaves(TreeNode root) {
        int count = 0;

        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null || (root.left == null && root.right == null)){
            return count;
        }

        q.add(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();

            if(node.left != null  ){
                
                if(node.left.left == null && node.left.right == null){
                    count += node.left.val;
                }else{
                    q.add(node.left);
                }
            }
            if(node.right != null){
                q.add(node.right);
                
            }
            
        }

        return count;
    }
}