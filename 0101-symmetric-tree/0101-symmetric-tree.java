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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root.left);
        qu.add(root.right);
        

        while(!qu.isEmpty()){
            TreeNode node1 = qu.poll();
            TreeNode node2 = qu.poll();
            
            if(node1 == null && node2 == null) continue;

            if(node1 == null || node2 == null || node1.val != node2.val) return false;

            qu.add(node1.left);
            qu.add(node2.right);
            qu.add(node1.right);
            qu.add(node2.left);
            
            
        }

        return true;
    }
}