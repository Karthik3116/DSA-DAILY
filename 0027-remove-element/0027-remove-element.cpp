class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        
        vector<int>res;
        // int idx = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums[i] != val){
                res.push_back(nums[i]);
                
            }
        }

        nums = res;
        return nums.size();
    }
};