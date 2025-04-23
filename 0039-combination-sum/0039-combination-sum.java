class Solution {
    public void  solve(int[] input , int idx , int target , List<Integer> ans , List<List<Integer>> output){

        if(target == 0){
            output.add(new ArrayList(ans));
            return;
        }

        if(target < 0 || idx >= input.length){
            return ;
        }


        ans.add(input[idx]);
        System.out.println(ans);
        solve(input , idx , target - input[idx] , ans , output);
        ans.remove(ans.size() - 1);
        solve(input , idx + 1 , target , ans , output);
        

        
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        
        solve(candidates , 0 , target, new ArrayList<>() , ans);
        return ans;
    }
}