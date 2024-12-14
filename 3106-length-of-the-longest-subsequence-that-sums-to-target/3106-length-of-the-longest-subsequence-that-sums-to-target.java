class Solution {

    public int solve(int i , List<Integer> nums , int target , int[][]dp){
        if(target == 0){
            return 0;
        }

        if(i >= nums.size() || target < 0){
            return Integer.MIN_VALUE;
        }

        if(dp[i][target] != -1){
            return dp[i][target];
        }

        int one = Integer.MIN_VALUE;
        if(target - nums.get(i) >= 0){
            one =1 + solve(i+1,nums , target - nums.get(i) , dp);
        }
        int two = solve(i+1,nums , target , dp);
        
        dp[i][target] = Math.max(one , two);

        return dp[i][target];

    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int [][]dp = new int[nums.size() + 1][target + 1];
        for(int i = 0 ; i <= nums.size() ; i++){
            for(int j = 0 ; j <= target ; j++){
                dp[i][j] = -1;
            }
        }
        int result = solve(0,nums , target , dp) ;
        return result < 0 ? -1: result;
    }
}