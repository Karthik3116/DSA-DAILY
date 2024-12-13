class Solution {

    public List<String> solve(String input , String output , List<String> ans , int curr_index ){
        if(curr_index == input.length()){

            ans.add(output);
            return ans;
        }
        while( curr_index < input.length() && !Character.isLetter(input.charAt(curr_index)) ){
            output += input.charAt(curr_index);
            curr_index++;
        }

        if (curr_index == input.length()) {
            ans.add(output);
            return ans;
        }
        
        solve(input , output + Character.toLowerCase(input.charAt(curr_index)) ,ans ,curr_index+1  );
        solve(input , output + Character.toUpperCase(input.charAt(curr_index)) ,ans ,curr_index+1  );

        return ans;
    }
    public List<String> letterCasePermutation(String s) {
        
        return solve(s , "" , new ArrayList<String>() , 0);
    }
}