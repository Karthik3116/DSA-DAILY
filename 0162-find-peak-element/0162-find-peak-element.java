class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length , first_last = Integer.MIN_VALUE;;
        if(len == 1){
            return 0;
        }if(len == 2){
            return nums[0] > nums[1] ? 0 : 1;
        }
        for(int i = 1; i < len-1 ; i++){
            if(nums[i-1] < nums[i] && nums[i] > nums[i+1]){
                return i;
            }
        }

        if(nums[len - 1] > nums[len - 2]){return len - 1;};
        if(nums[0] > nums[1]){return 0;};
           

        return -1;
    }
}