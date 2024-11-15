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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        if(root == null){
            return 0;
        }

        q.add(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            ans.add(node.val);

            if(node.left != null){
                q.add(node.left);
            }

            if(node.right != null){
                q.add(node.right);
            }
        }

        Collections.sort(ans);
        int one = 0;
        int two = 1;
        int min = Math.abs(ans.get(one) - ans.get(two));

        for(int i = 1 ; i < ans.size() - 1 ; i++){
            int diff = Math.abs(ans.get(i) - ans.get(i+1));

            if(diff < min){
                min = diff;
            }
        }

        return min; 
    }
}