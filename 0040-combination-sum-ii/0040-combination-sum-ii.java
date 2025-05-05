class Solution {

    public void solve(int[] input ,int idx, int target , List<Integer>output , List<List<Integer>> ans){

        if(target == 0){
            
            ans.add(new ArrayList(output));
            return;
        }
        
        if(target < 0  || idx == input.length ){
            return ;
        }

        output.add(input[idx]);
        solve( input , idx+1, target - input[idx] , output , ans);

        output.remove(output.size() - 1);

        while( idx + 1< input.length && input[idx] == input[idx + 1]){
            idx++;
        }

        solve( input , idx+1, target , output , ans);

        
        
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        
        
        solve(candidates, 0 , target ,  new ArrayList<>() , ans);
        
        
        return ans;
    }
}