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
    public boolean isUnivalTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        if(root == null){
            return false;
        }


        q.add(root);
        while(!q.isEmpty()){

            TreeNode node = q.poll();
            

            map.put(node.val , map.getOrDefault(node.val , 0) + 1);
            if(map.size() > 1){
                return false;
            }

            if(node.left != null){
                q.add(node.left);
            }

            if(node.right != null){
                q.add(node.right);
            }


        }

        return true;
    }
}