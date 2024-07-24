class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        
        int size = nums.size();
        int x = 0;
        vector<int>vec(size);
        if(size > k){
            int idx = size - k;

            for(int i = idx; i < size; i++){
                vec[x] = nums[i];
                x++;
            }

            for(int i = 0; i < idx; i++){
                vec[x] = nums[i];
                x++;
            }
            
            
        }else{

            int idx = size - (k%size);
            for(int i = idx; i < size; i++){
                vec[x] = nums[i];
                x++;
            }

            for(int i = 0; i < idx; i++){
                vec[x] = nums[i];
                x++;
            }

        }

        nums = vec;
        
    }
};