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


/*
Method 1 :- KMIT FS

class Solution {
    public TreeNode Build(int[]inorder , int[] postorder , int start , int end , Map<Integer,Integer> map, int[]curr){
        if(start > end){
            return null;
        }
        TreeNode root = new TreeNode(postorder[curr[0]]);
        curr[0] -= 1;
        // in preorder we do L->R->ROOT
        int rootidx = map.get(root.val);
        root.right = Build(inorder , postorder , rootidx + 1 , end , map, curr);
        root.left = Build(inorder , postorder , start , rootidx - 1 , map, curr);

        return root;
        
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = postorder.length;
        int[]curr = new int[]{n-1};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            map.put(inorder[i] , i);
        }

        return Build(inorder , postorder , 0 , n-1 , map, curr);
    }
}
 */
// Method 2 :- YT
class Solution {
    public TreeNode Build(int[]inorder , int in_start, int in_end , int[]postorder , int post_start , int post_end , Map<Integer,Integer> map){
        if(in_start > in_end || post_start > post_end){
            return null;
        }
        TreeNode root = new TreeNode(postorder[post_end]);
        
        int root_idx = map.get(postorder[post_end]);
        
        int nums_left = root_idx - in_start;

        root.left = Build(inorder , in_start , root_idx - 1, postorder , post_start , post_start + nums_left - 1 , map);

        root.right = Build(inorder , root_idx + 1 , in_end , postorder , post_start + nums_left  , post_end - 1, map);

        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            map.put(inorder[i], i);
        }

        return Build(inorder , 0 , n-1 , postorder , 0 , n-1 , map);
    }
}