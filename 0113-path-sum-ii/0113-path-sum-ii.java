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
    public void solve(TreeNode root , int target ,List<Integer> output , List<List<Integer>> ans){
        if(root == null){return;};
        
        output.add(root.val);

        
        if(root.left == null && root.right == null && target == root.val){
            ans.add(new ArrayList(output));
            
        }

        solve(root.left , target - root.val , output , ans );
        
        solve(root.right , target- root.val  , output , ans );

        output.remove(output.size() - 1 );

        return;
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum  ) {
        List<List<Integer>> ans = new ArrayList<>();    

        

        solve(root ,targetSum, new ArrayList<>() , ans);
        return ans;
    }
}