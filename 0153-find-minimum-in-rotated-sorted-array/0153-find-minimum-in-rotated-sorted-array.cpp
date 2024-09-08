class Solution {
public:
    int findMin(vector<int>& nums) {
        if(nums.size() == 1){
            return nums[0];
        }


        int mainmin = 99999;
        int last = nums.size();
        for(int i = 0 ; i < nums.size()-1 ; i++){
            int currmin = min(nums[i] , nums[i+1]); 
            
            mainmin  = min(mainmin , currmin);
        }

        return mainmin;
    }
};