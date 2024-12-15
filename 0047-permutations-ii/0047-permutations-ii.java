class Solution {

    public List<List<Integer>> solve(int[] nums , List<List<Integer>> ans , List<Integer> ds , boolean[] visited , Set<List<Integer>> set){
        if(ds.size() == nums.length){
            if(!set.contains(ds)){
                ans.add(new ArrayList(ds));
                set.add(new ArrayList(ds));
            
            }
            return ans ;
        }

        for(int i =  0 ; i < nums.length ; i++){
            if(!visited[i]){
                visited[i] = true;
                ds.add(nums[i]);
                solve(nums , ans , ds , visited, set);
                ds.remove(ds.size() -1);
                visited[i] = false;
            }
        }

        return ans;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[]visited = new boolean[nums.length];
        Set<List<Integer>> set = new HashSet<>();
        return solve(nums , ans ,ds , visited , set );
    }
}