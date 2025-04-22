class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
        long count = 0, cons = 0;

        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] != 0){
                count += ((cons*(cons+1))/2);
                cons = 0;
            }else{
                cons++;
                
            }
        }

        return count+ ((cons*(cons+1))/2);
    }
}