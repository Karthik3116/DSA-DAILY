class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {

        unordered_map<int, int> idx_map;
        int size = nums.size();
        for(int i = 0; i < size; i++){
            int compliment = target - nums[i];
            if(idx_map.find(compliment) != idx_map.end()){
                return {idx_map[compliment], i};
            }

            idx_map[nums[i]] = i;
        }

        return {};
        
        }

};