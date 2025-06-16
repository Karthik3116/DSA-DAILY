class Solution {
    public int maximumDifference(int[] nums) {
        
        int ans = Integer.MIN_VALUE;
        int min = nums[0];

        for(int i = 0 ; i < nums.length ; i++){

            min = Math.min(min , nums[i]);
            ans = Math.max(ans , nums[i] - min);
        }

        return ans != 0 ? ans : -1 ;
    }
}