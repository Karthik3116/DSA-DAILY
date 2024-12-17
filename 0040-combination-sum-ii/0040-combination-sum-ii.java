class Solution {

    public void solve(int[] input , int target , int idx , List<Integer>output , List<List<Integer>> ans){

        if(target == 0){
            
            ans.add(new ArrayList(output));
            return;
        }
        // 1 1 2 5 6 7 10
        for(int i = idx ; i < input.length ; i++){

            if(i > idx && input[i] == input[i-1]){continue;};
            if(input[i] > target){return;};

            output.add(input[i]);
            solve(input, target - input[i], i + 1, output, ans);
            output.remove(output.size() - 1);
            // solve(input, target, i + 1, output, ans);
        }
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates , target , 0 , new ArrayList<>() , ans);
        return ans;
    }
}