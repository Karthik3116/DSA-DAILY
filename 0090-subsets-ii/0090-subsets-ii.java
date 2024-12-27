class Solution {
    public void solve(int[] nums , int idx , List<Integer> output , List<List<Integer>> ans){

        ans.add(new ArrayList(output));

        for(int i = idx ; i < nums.length ; i++){
            if(i > idx && nums[i] == nums[i-1]){continue;};
            output.add(nums[i]);
            solve(nums , i + 1 , output , ans);

            output.remove(output.size() - 1);
            
        }
    
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums , 0 , new ArrayList<>(), ans);
        return ans;
    }
}