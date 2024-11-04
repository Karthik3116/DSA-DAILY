// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashSet<Integer> mymap = new HashSet<>();

//         for(int num : nums){
//             if(!mymap.add(num)){
//                 return true;
//             }
//         }

//         return false;

//     }
// }


import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] == nums[i])
                return true;
            else if (nums[i] < nums[i - 1]){
                int temp = nums[i - 1];
                for(int j = i - 2; j >= 0; j--){
                    if(nums[i] == nums[j])
                        return true;
                }
                nums[i - 1] = nums[i];
                nums[i] = temp;
            }
        }
        return false;

    }
}