class Solution {
    public void solve(Map<Character , String> map , StringBuilder output , int idx , String digits, List<String> ans){

        if(idx == digits.length()){
            ans.add(output.toString());
            return;
        }

        for(char letter : map.get(digits.charAt(idx)).toCharArray()){
            output.append(letter);
            solve(map , output , idx +1 , digits , ans);
            output.deleteCharAt(output.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0){return ans;}
        Map<Character , String> map = new HashMap<>();
        map.put('2' , "abc");
        map.put('3' , "def");
        map.put('4' , "ghi");
        map.put('5' , "jkl");
        map.put('6' , "mno");
        map.put('7' , "pqrs");
        map.put('8' , "tuv");
        map.put('9' , "wxyz");
        

        solve(map , new StringBuilder() , 0 , digits , ans);

        return ans;
    }
}