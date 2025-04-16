class Solution {
    public int findNumbers(int[] nums) {
        
        StringBuilder temp = new StringBuilder();
        int n = nums.length, ans = 0;
        for(int i = 0 ; i < n ; i++){
            temp.setLength(0);
            temp.append(nums[i]);

            if(temp.length() % 2 == 0){
                ans++;
            }
        }

        return ans;
    }
}