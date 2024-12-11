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
    public List<Integer> largestValues(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if(root == null){return ans;};
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){

            int level_size = q.size();
            int max = Integer.MIN_VALUE;

            for(int i = 0 ; i < level_size ; i++){
                TreeNode curr_node = q.poll();
                max = Math.max(max , curr_node.val);

                if(curr_node.left != null){
                    q.add(curr_node.left);
                }
                if(curr_node.right != null){
                    q.add(curr_node.right);
                }
            }

            ans.add(max);

        }

        return ans;
        
    }
}