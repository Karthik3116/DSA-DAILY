class Solution {

    public void solve(int[] input , List<List<Integer>> ans , List<Integer> output , int target , int idx , int max_units){

        if(target  == 0 && max_units != output.size()){return;};
        if(target == 0 && max_units == output.size()){
            ans.add(new ArrayList(output));
            return;
        }

        if(target < 0 || idx >= input.length){
            return;
        }
        
        output.add(input[idx]);
        solve(input , ans , output , target - input[idx] , idx + 1 ,max_units );
        output.remove(output.size() - 1);
        solve(input , ans , output , target  , idx + 1, max_units);
        
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        int[]nums = {1,2,3,4,5,6,7,8,9};

        List<List<Integer>> ans = new ArrayList<>();
        solve(nums , ans , new ArrayList<>() , n, 0, k );
        return ans;
    }
}