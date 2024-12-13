// class Solution {

//     public int solve(List<Integer> input , int size , int target , int sum , int curr_index, Map<String, Integer> memo){
//         if(curr_index == input.size()){

//             if(target == sum){return size;}
//             return -1;
//         }

//         String key = sum + "," + size + "," + curr_index;
//         if(memo.containsKey(key)){
//             return memo.get(key);
//         }
//         int one = solve(input , size + 1 , target , sum + input.get(curr_index) , curr_index + 1 , memo);
        
//         int two = solve(input , size , target , sum  , curr_index + 1, memo);
//         int result = Math.max(one , two);
//         memo.put(key , result);
//         return result;

//     }
    
//     public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
//         Map<String, Integer> memo = new HashMap<>();
//         return solve(nums , 0, target , 0,0, memo);
//     }
// }



// class Solution {
//     public int solve(List<Integer> input, int target, int sum, int curr_index, Map<String, Integer> memo){
        
        
//         if(curr_index == input.size()){
//             return (sum == target) ? 0 : -1;
//         }

//         String key = sum + "," + curr_index;

//         if (memo.containsKey(key)) {
//             return memo.get(key);
//         }

//         int one = solve(input, target, sum + input.get(curr_index), curr_index + 1, memo);
//         if(one != -1){
//             one = one + 1;
//         }
//         int two = solve(input, target, sum, curr_index + 1, memo );


//         int result = Math.max(one, two);

//         memo.put(key, result);
//         return result;

        

//     }
//     public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
//         Map<String, Integer> memo = new HashMap<>();
//         return solve(nums , target , 0 , 0 , memo);
//     }
// }


// class Solution {
//     Map<String,Integer> memo = new HashMap<>();
//     public int solve(int i  , List<Integer> nums , int target){
//         if(target == 0){
//             return 0;
//         }

//         if(target < 0 || i >= nums.size()){
//             return -1;
//         }
//         String key = i + "," + target;
//         if(memo.containsKey(key)){
//             return memo.get(key);
//         }

//         int a = solve(i+1, nums , target - nums.get(i));
//         if (a != -1) {
//             a = 1 + a; // If valid, include the element in the subsequence (count this element)
//         }
//         int b = solve(i+1,nums , target);

//         int result = Math.max(a , b);
//         memo.put(key ,result);
//         return result;


//     }
//     public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        
//         return solve(0 , nums , target);
//     }
// }













class Solution {

    public int solve(int i , List<Integer> nums , int target , int [][] dp ){

        if(target == 0){
            return 0;
        }

        if(i >= nums.size() || target < 0){
            return Integer.MIN_VALUE;
        }

        if(dp[i][target] != -1){
            return dp[i][target];
        }
        int a = 1 + solve(i + 1 , nums , target - nums.get(i), dp);
        int b = solve(i + 1 , nums , target, dp);

        dp[i][target] = Math.max(a , b);

        return dp[i][target];
    }
    
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int [][]dp = new int[nums.size() +1][target + 1];
        for (int i = 0; i <= nums.size(); i++) {
            for (int j = 0; j <= target; j++) {
                dp[i][j] = -1;
            }
        }
        int result = solve(0 , nums , target , dp);
        return result < 0 ? -1 : result;   
    }
}





















