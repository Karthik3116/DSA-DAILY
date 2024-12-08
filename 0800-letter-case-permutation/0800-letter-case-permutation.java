
class Solution {

    public List<String> solve(String input , String output , List<String> ans , int curr_index){
        if(curr_index == input.length()){
            ans.add(output);
            return ans;
        }

        char curr_char = input.charAt(curr_index);
        if(!Character.isLetter(curr_char)){
            return solve(input , output + curr_char, ans , curr_index + 1);
        }

        // solve(input , output + curr_char, ans , curr_index + 1);

        // if(Character.isUpperCase(curr_char)){
            solve(input , output + Character.toLowerCase(input.charAt(curr_index)),ans, curr_index +1 );
        // }else{
            solve(input , output + Character.toUpperCase(input.charAt(curr_index)),ans, curr_index +1 );    
        // }

        return ans;

    }

    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        return solve(s, "", ans, 0);
    }
}
