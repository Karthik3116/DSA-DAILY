




class Solution {
    
    public void solve(int[] input,  List<List<Integer>> ans , List<Integer> output){

        if(output.size() == input.length){
            ans.add(new ArrayList(output));
            return;
        }

        for(int i = 0 ; i < input.length ; i++){

            if(input[i] != -11){
               
               
                output.add(input[i]);
                input[i] = -11;
                solve(input , ans , output);
                input[i] = output.get(output.size()-1);

                output.remove(output.size() -1);
               
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, ans, new ArrayList<>());   
        return ans;

    }
}








