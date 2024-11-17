class Solution {
    public int[] productExceptSelf(int[] nums) {

        // int total  = 1 ,  zero_count = 0;
        // boolean has_zero = false;

        // for(int i = 0 ; i < nums.length ; i++){
        //     if(nums[i] != 0 ){
        //         total *= nums[i];
        //     }else{
        //         has_zero = true;
        //         zero_count += 1;
        //     }
        // } 
        // int []ans = new int[nums.length];

        // if(zero_count >1 ){
        //     return ans;
        // }

        

        // if(has_zero){
        //     for(int i = 0 ; i < nums.length ; i++){
        //         if(nums[i] == 0){
        //             ans[i] = total;
        //         }
        //     }
        // }else{
        //     for(int i = 0 ; i < nums.length ; i++){
        //         ans[i] = total/nums[i];
        //     }
        // }

        // return ans;


        int []ans = new int[nums.length];
        ans[0] = 1;
        // prefix 
        for(int i = 1 ; i < nums.length ; i++){
            ans[i] = nums[i-1] * ans[i - 1];

            
        }

        // postfix
        int postfix = 1;
        for(int i = nums.length - 1 ; i >= 0 ; i--){
            ans[i] = postfix * ans[i];
            postfix =  nums[i] * postfix;
        }

        return ans;
        
    }
}