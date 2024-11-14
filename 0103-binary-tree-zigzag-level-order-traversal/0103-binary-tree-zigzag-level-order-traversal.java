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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null){
            return ans;
        }

        q.add(root);

        int count = 1;

        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int s = q.size();

            

            for(int i = 0 ; i < s ; i++){
                TreeNode node = q.poll();
                level.add(node.val);

                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
                
            }
            if(count %2 == 0){
                Collections.reverse(level);
            }

            count += 1;

            ans.add(level);
        }

        return ans;
    }
}