class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mymap = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            
            if(mymap.containsKey(nums[i])){
                return new int[] {mymap.get(nums[i]) , i};
            }else{
                mymap.put((target - nums[i]), i);
            }
        }

        return new int[] {};
    }
}