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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();

        if(root == null){return ans;};

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){

            int level_size = q.size();
            int rnode = 0;

            for(int i = 0 ; i < level_size ; i++){
                TreeNode curr_node = q.poll();
                if(i == 0){rnode = curr_node.val;};

                if(curr_node.right != null){
                    q.add(curr_node.right);

                }

                if(curr_node.left != null){
                    q.add(curr_node.left);
                }
                
            }

            ans.add(rnode);

        }

        return ans;
    }
}