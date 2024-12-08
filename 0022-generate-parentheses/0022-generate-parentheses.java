class Solution {
    // public static boolean check(String s) {
    //     Stack<Character> stack = new Stack<>();
    //     for (char c : s.toCharArray()) {
    //         if (c == '(' || c == '[' || c == '{') {
    //             stack.push(c);
    //         } else {
    //             if (stack.isEmpty()) {
    //                 return false;
    //             }
    //             char top = stack.pop();
    //             if ((c == ')' && top != '(') || 
    //                 (c == ']' && top != '[') || 
    //                 (c == '}' && top != '{')) {
    //                 return false;
    //             }
    //         }
    //     }
    //     return stack.isEmpty();
    // }


    // public List<String> print(String output , int inputlen ,List<String> ans){
    //     if(output.length() == inputlen){

    //         if(check(output)){
    //             ans.add(output);
    //             System.out.println(output);
    //         }
    //         return ans;
    //     }

    //     print(output + "(" , inputlen ,ans);
    //     print(output + ")" , inputlen, ans);
    //     return ans;
        
    // }

    public List<String> solve(List<String> ans , int open , int close , int total , String output){
        if(open+close == total){
            ans.add(output);
            return ans;
        }

        
        if(close > open ){
            return ans ;
        }

        if(open == total/2){
            return solve(ans , open , close+1 , total , output + ")");
        }
        if(close == total / 2){
            return solve(ans , open + 1 , close , total , output + "(");
        }
        solve(ans , open + 1, close , total , output + "(");
        solve(ans , open , close+1 , total , output + ")");

        return ans;
    }
    
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        // ans = print(new String("") , 2*n, ans);
        ans = solve(ans , 1,0,n*2 , new String("(")); 
        return ans;
    }
}