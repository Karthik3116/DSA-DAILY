class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {

        int idx = 0 ,a , b, size = nums.size();

        if (target <= nums[0]) {
            return 0;
        }
        
        if (target > nums[size - 1]) {
            return size;
        }

        for(int i = 0; i < size-1; i++){
            if(nums[0] >= target){
                return 0;
            }
            else if(nums[i] <= target  && target <= nums[i+1]){
                return i+1;

            }
        }

        return size;
        
    }
};