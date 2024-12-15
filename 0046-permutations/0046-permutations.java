class Solution {
    public List<List<Integer>> solve(int[] nums , boolean[] visited , List<List<Integer>> ans , List<Integer> ds){
        if(ds.size() == nums.length){
            ans.add(new ArrayList(ds));
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(!visited[i]){
                visited[i] = true;
                ds.add(nums[i]);
                solve(nums , visited , ans , ds);
                ds.remove(ds.size() - 1);
                visited[i] = false;
            }
        }

        return ans;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        return solve(nums , new boolean[nums.length] , ans , new ArrayList<Integer>() );   
    }
}