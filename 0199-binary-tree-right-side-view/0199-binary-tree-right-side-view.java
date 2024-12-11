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

    public List<Integer> dfs(TreeNode root , List<Integer> ans, int level){
        if(root == null){
            return ans;
        }
        if(level == ans.size()){
            ans.add(root.val);
        }
        dfs(root.right , ans , level+1);
        dfs(root.left , ans , level+1);
        return ans;
    }

    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();

        return dfs(root,ans,0);
    }
}