class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int[]prefix = new int[nums.length + 1];

        for(int i = 0 ; i < nums.length ; i++){
            prefix[i+1] = nums[i] + prefix[i];
        }


        int[]ans = new int[queries.length];

        int sum = 0, curr, l , r,mid; 
        for(int i = 0 ; i < queries.length ; i++){
            curr = queries[i];
            l = 0;r=nums.length;

            while(l < r){
                mid = (l+r+1)/2;
                if(prefix[mid] <= curr){
                    l = mid;
                }else{
                    r = mid - 1;
                }
            }

            ans[i] = l;
            
            

        }

        return ans;


    }
}