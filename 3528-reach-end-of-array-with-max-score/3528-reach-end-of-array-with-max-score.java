class Solution {
    public long findMaximumScore(List<Integer> nums) {
        
        long prev = nums.get(0) , prev_idx = 0, ans = 0;
        
        for(int i = 1 ; i < nums.size() ; i++){

            if(nums.get(i) > prev ){
                ans += (i - prev_idx) * prev;
                prev = nums.get(i);
                prev_idx = i;
            }
            
        }

        if(prev_idx != nums.size()-1 ){

            ans += (nums.size()-1 - prev_idx) * prev;
        }

        return ans;
    }
}
