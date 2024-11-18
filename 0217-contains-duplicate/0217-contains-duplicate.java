class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> mymap = new HashSet<>();

        for(int num : nums){
            if(!mymap.add(num)){
                return true;
            }
        }

        return false;

    }
}
