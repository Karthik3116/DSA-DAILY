




// class Solution {
    
//     public void solve(int[] input,boolean[] visited ,   List<List<Integer>> ans , List<Integer> output){

//         if(output.size() == input.length){
//             ans.add(new ArrayList(output));
//             return;
//         }

//         for(int i = 0 ; i < input.length ; i++){

//             if(!visited[i]){
//                 visited[i] = true;
//                 output.add(input[i]);
//                 solve(input , visited , ans , output);
//                 output.remove(output.size() -1);
//                 visited[i] = false;

//             }
//         }
//     }

//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         solve(nums, new boolean[nums.length], ans, new ArrayList<>());   
//         return ans;

//     }
// }








class Solution {
    public void solve(int[] input , int[] output , boolean[] visited , List<List<Integer>> ans, int idx){

        if(idx == input.length){
            Integer[] temp = Arrays.stream(output).boxed().toArray(Integer[]::new);
            ans.add(Arrays.asList(temp));
            return ;
        }

        for(int i = 0 ; i < input.length ; i++){

            if(!visited[i]){
                visited[i] = true;
                output[idx] = input[i];
                solve(input , output , visited , ans , idx+1);
                visited[i] = false;
                
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        
        
        
        List<List<Integer>> ans = new ArrayList<>();
        
        solve(nums , new int[nums.length] , new boolean[nums.length] ,ans ,0);
        return ans;
    }
}
























