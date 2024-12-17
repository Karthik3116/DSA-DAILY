class Solution {
    
    public int solve(int [] input , int target , Map<Integer, Integer> memo ){
        if(target == 0){
            // System.out.println("1");
            return 1;
        }

        if(target < 0 ){
            return 0;
        }

        if (memo.containsKey(target)) {
            return memo.get(target);
        }
        
        int totalways = 0;
        
        for(int i = 0 ; i < input.length ; i++){
            
            if(target >= input[i]){
                totalways += solve(input , target - input[i] , memo );
            }
        }
        memo.put(target , totalways);
        return totalways;
    }
    public int combinationSum4(int[] nums, int target) {
        
        Map<Integer, Integer> memo = new HashMap<>(); 
        
        return solve(nums , target, memo );
    }
}