class Solution {
    public int removeElement(int[] nums, int val) {
        
        int count = 0 , ans = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == val){
                count++;
            }else{
                ans++;
                int temp = nums[i];
                nums[i] = nums[i - count];
                nums[i - count] = temp;
            }
        }
        return ans;
    }
}