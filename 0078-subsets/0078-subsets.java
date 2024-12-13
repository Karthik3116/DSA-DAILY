class Solution {
    public List<List<Integer>> solve(int[] input , List<Integer> output , int curr_index , List<List<Integer>> ans){
        if(curr_index == input.length){
            ans.add(new ArrayList<>(output));
            return ans;
        }
        output.add(input[curr_index]);
        solve(input , output , curr_index + 1, ans);
        output.remove(output.size()-1);
        solve(input , output , curr_index + 1, ans);
        return ans;
    }
    public List<List<Integer>> subsets(int[] nums) {
        
        return solve(nums , new ArrayList<Integer>() , 0 ,new  ArrayList<List<Integer>>());
    }
}