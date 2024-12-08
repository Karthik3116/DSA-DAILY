class Solution {

    public List<List<Integer>> gen(int vec[] , int n , int size , int[]curr, List<List<Integer>>ans ){
        if(n == size ){
            List<Integer> temp = new ArrayList<>();
            for(int num : vec){
                if(num != -99){
                    temp.add(num);
                }
            }
            ans.add(temp);
            return ans;
        }
        vec[size - 1] = -99;
        gen(vec , n  , size - 1 , curr , ans);
        vec[size - 1] = curr[size-1];
        gen(vec , n  , size - 1, curr , ans);
        return ans;
         
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans = gen(new int[nums.length] , 0 , nums.length , nums , ans);
        return ans;
    }
}