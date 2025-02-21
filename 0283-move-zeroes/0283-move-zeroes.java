
// class Solution {
//     public void moveZeroes(int[] nums) {
        
//         int c = 0;
//         for(int i = 1 ; i < nums.length ; i++){

//             if(nums[c] != 0){
//                 c++;
//             }

//             if(nums[i] != 0 && c < i){
//                 int temp = nums[i];
//                 nums[i] = nums[c];
//                 nums[c] = temp;
//             }
//         }
//     }
// }

class Solution {
    public void moveZeroes(int[] nums) {
        
        int c = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[c];
                nums[c] = temp;
                c++;
            }
        }
        System.gc();

    }
}