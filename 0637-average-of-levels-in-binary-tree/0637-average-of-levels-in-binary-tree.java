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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avg = new ArrayList<>();


        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){

            int level_size = q.size();
            double level_sum = 0.0000; 

            for(int i = 0 ; i < level_size ; i++){
                TreeNode curr_node = q.poll();
                level_sum += (double) curr_node.val;

                if(curr_node.left != null){
                    q.add(curr_node.left);
                }
                if(curr_node.right != null){
                    q.add(curr_node.right);
                }
            }

            avg.add(level_sum/level_size);

        }

        return avg;
    }
}