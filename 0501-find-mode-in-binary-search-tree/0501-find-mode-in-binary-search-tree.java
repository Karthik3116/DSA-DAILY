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

    public void inorder(TreeNode root , List<Integer> ans){
        if(root == null){
            return;
        }

        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
        
    }

    public int[] findMode(TreeNode root) {
        
        List<Integer> nodes = new ArrayList<>();

        inorder(root, nodes);
        

        int curr_num = nodes.get(0);
        int curr_streak = 1, max_streak = 1;

        List<Integer> modes = new ArrayList<>();
        modes.add(curr_num);

        for(int i = 1  ; i < nodes.size() ; i++){
            if(curr_num == nodes.get(i)){
                curr_streak++;
            }else{
                curr_num = nodes.get(i);
                curr_streak = 1;
            }
            
            if(curr_streak > max_streak){
                max_streak = curr_streak;
                modes.clear();
                modes.add(nodes.get(i));

            }else if(curr_streak == max_streak){
                modes.add(nodes.get(i));
            }

        }
        int[]res = new int[modes.size()];
        for(int i = 0 ; i < modes.size() ; i++ ){
            res[i] = modes.get(i);
        }

        return res;
    }
}