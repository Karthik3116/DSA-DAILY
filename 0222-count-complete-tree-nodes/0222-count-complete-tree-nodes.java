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
    public int[] preorder(TreeNode root , int[] count){
        if(root == null){
            return count;
        }
        count[0]++;
        preorder(root.left, count);
        preorder(root.right, count);
        return count;
    }
    public int countNodes(TreeNode root) {
        int[]count = new int[]{0};
        return preorder(root, count)[0];
    }
}