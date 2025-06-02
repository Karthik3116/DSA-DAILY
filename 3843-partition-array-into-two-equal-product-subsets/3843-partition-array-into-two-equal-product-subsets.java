class Solution {

    public boolean solve(int[] nums, int idx ,long prod1 , long prod2 , long target){

        if(idx >= nums.length){
            if((prod1 == target ) && (prod2 == target)){
                
                return true;
            }
            return false;
        }

        boolean left = left =  solve(nums , idx + 1 , prod1 * nums[idx], prod2  , target );;

         
        boolean right = solve(nums , idx + 1 , prod1 , prod2 * nums[idx], target);

        return left || right;

    }
    public boolean checkEqualPartitions(int[] nums, long target) {
        
        long prod = 1;
        for(int num : nums){
            prod *= num;
        }

        return solve(nums ,  0 ,1 , 1 , target );
    }
}