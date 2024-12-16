// class Solution {
//     public List<List<Integer>> solve(int[] nums , boolean[] visited , List<List<Integer>> ans , List<Integer> ds){
//         if(ds.size() == nums.length){
//             ans.add(new ArrayList(ds));
//             return ans;
//         }

//         for(int i = 0 ; i < nums.length ; i++){
//             if(!visited[i]){
//                 visited[i] = true;
//                 ds.add(nums[i]);
//                 solve(nums , visited , ans , ds);
//                 ds.remove(ds.size() - 1);
//                 visited[i] = false;
//             }
//         }

//         return ans;
//     }
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         return solve(nums , new boolean[nums.length] , ans , new ArrayList<Integer>() );   
//     }
// }





class Solution {
    
    public void solve(int[] input,boolean[] visited ,   List<List<Integer>> ans , List<Integer> output){

        if(output.size() == input.length){
            ans.add(new ArrayList(output));
            return;
        }

        for(int i = 0 ; i < input.length ; i++){

            if(!visited[i]){
                visited[i] = true;
                output.add(input[i]);
                solve(input , visited , ans , output);
                output.remove(output.size() -1);
                visited[i] = false;

            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, new boolean[nums.length], ans, new ArrayList<>());   
        return ans;

    }
}





