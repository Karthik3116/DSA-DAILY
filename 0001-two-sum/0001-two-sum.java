class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // int count;
        // int []ans = new int[2];
        // for(int i = 0 ; i < nums.length; i++){
        //     for(int j = i+1 ; j < nums.length ; j++){
        //         if((nums[i]+nums[j]) == target){
        //             ans[0] = i;
        //             ans[1] = j;

        //             break;
        //         }
        //     }
        // }

        int []retval = new int[2];
        HashMap<Integer , Integer > answer = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){

            if(answer.containsKey(nums[i])){
                retval[0] = answer.get(nums[i]);
                retval[1] = i;
                break;
            }else{
                answer.put(target-nums[i], i);
            }
        }
        return retval;

        // return ans;
    }
}